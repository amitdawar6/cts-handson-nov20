package excercise5;

@SuppressWarnings("serial")
public class AccountAlreadyExistsException extends Exception {

		public AccountAlreadyExistsException(String msg) {
			super(msg);
		}
}
