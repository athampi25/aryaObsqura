package assignment;

public class User extends ATM {

	public static void main(String[] args) {
		User u = new User();
		u.setPin(1212);
		u.validatePin();

	}

}
