package exceptionHandling;

public class ThrowsExceptionHandling {

	public static void main(String[] args) throws VotingException{
		int age =12;
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new VotingException("Not eligible to vote");
		}

	}

}
