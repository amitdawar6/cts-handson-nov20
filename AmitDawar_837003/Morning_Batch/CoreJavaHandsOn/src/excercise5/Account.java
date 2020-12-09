package excercise5;

public class Account {
	private long acc_number;
	private long acc_balance;
	private String name;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long acc_number, long acc_balance, String name) {
		super();
		this.acc_number = acc_number;
		this.acc_balance = acc_balance;
		this.name = name;
	}

	public long getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}

	public long getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(long acc_balance) {
		this.acc_balance = acc_balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [acc_number=" + acc_number + ", acc_balance=" + acc_balance + ", name=" + name + "]";
	}
	
	
	

}