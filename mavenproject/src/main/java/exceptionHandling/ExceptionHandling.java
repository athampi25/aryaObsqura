package exceptionHandling;

public class ExceptionHandling {
	

	public static void main(String[] args) {
		try{
			int a =3;
		
			int b = a/0;
		System.out.println(b);
		}
		catch(ArithmeticException ae){
			System.out.println("Exception is "+ae);
			
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
