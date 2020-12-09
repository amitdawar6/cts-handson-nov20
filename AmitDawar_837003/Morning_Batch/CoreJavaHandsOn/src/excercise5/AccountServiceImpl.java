package excercise5;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

	List<Account> list = new ArrayList<>();
	
	@Override
	public void addAccount(Account acc) throws AccountAlreadyExistsException{
		for(Account account : list ) {
			if(account.getAcc_number()==acc.getAcc_number()) {
				throw new AccountAlreadyExistsException("Account already exists");
			}
		}
		list.add(acc);
		

	}

	@Override
	public void removeAccount(long acc_number) throws AccountNotFoundException {
		Account remAccount = null;
		
		for(Account account : list) {
			if(account.getAcc_number()==acc_number) {
				remAccount = account;
			}
		}
		
		if(remAccount == null) {
			throw new AccountNotFoundException("Account Not found");
		}
		else {
			for(Account account : list) {
				if(account.getAcc_number()==acc_number) {
					list.remove(acc_number);
				}
			}
		}
	}
	

	@Override
	public void getAccountByNumber(long acc_number) throws AccountNotFoundException {
		Account getAccount = null;
		
		for(Account account : list ) {
			if(account.getAcc_number() == acc_number) {
				getAccount = account;
			}
			
		}
		
		if(getAccount==null) {
			throw new AccountNotFoundException("Account not found");
		}
		else {
			System.out.println(getAccount);
		}
		

	}

	@Override
	public void getAllAccounts() {
		list.stream().forEach(item->System.out.println(item));
	}

	@Override
	public void getAccWithLowBal() {
		list.stream().forEach(item -> {if(item.getAcc_balance()<1000) System.out.println(item);});
	}

	

}
