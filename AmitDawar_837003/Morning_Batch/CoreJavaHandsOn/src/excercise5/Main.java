package excercise5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choice = 0;
		AccountService accountService = new AccountServiceImpl();

		do {
			System.out.println(
					"Menu: \n 1. Add Account \n 2. Remove Account by account no. \n 3. Display account by account no. \n 4. Display All Accounts \n 5. Display accounts with low balance \n 6. Exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Account no");
				long accNo = sc.nextLong();
				System.out.println("enter account name:");
				String name = sc.next();
				System.out.println("enter accBalance");
				long accbalance = sc.nextLong();
				try {
					accountService.addAccount(new Account(accNo, accbalance, name));
				} catch (AccountAlreadyExistsException e) {
					System.out.println("Duplicate account number");
				}
				break;
			case 2:
				System.out.println("Enter account no:");
				try {
					accountService.removeAccount(sc.nextLong());
				} catch (AccountNotFoundException e) {
					System.out.println("account does not exist");
				}
				break;
			case 3:
				System.out.println("enter account by account no");
				try {
					accountService.getAccountByNumber(sc.nextLong());
				} catch (AccountNotFoundException e) {
					System.out.println(" account does not exist");
				}
				break;
			case 4:
				accountService.getAllAccounts();
				break;
			case 5:
				accountService.getAccWithLowBal();
				break;
			}

		} while (choice < 6);
	}

}
