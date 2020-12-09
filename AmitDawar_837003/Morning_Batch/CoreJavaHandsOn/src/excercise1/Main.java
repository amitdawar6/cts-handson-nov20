package excercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User(101 , "Ace" , "ace123"));
		list.add(new User(101 , "Bob" , "bob123"));
		list.add(new User(101 , "Christy" , "chris123"));
		list.add(new User(101 , "Douglas" , "doug123"));
		list.add(new User(101 , "Evangeline" , "eve123"));
		
		for(User user: list) {
			if(user.getName().length()>5) {
				System.out.println(user);
			}
		}
	}

}
