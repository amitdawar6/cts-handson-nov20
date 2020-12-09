package excercise5;

public interface AccountService {
	
	public void addAccount(Account acc) throws AccountAlreadyExistsException;
	
	public void removeAccount(long l) throws AccountNotFoundException;
	
	public void getAccountByNumber(long acc_number) throws AccountNotFoundException;
	
	public void getAllAccounts();
	
	public void getAccWithLowBal();

	
}
