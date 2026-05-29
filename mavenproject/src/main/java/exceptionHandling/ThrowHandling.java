package exceptionHandling;

public class ThrowHandling {

	public static void main(String[] args) {
		int age = 13;
		if(age>=18) {
			System.out.println("Qualified for applying driving test");
		}
		else {
			throw new ArithmeticException("Not Qualified for driving test");
		}

	}

}
