package exceptionHandling;

public class MultipleExceptions {

	public static void main(String[] args) {
		try {
			int a[] = new int[4];
			System.out.println(a[4]);
			a[4]=6/0;
		}
		
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("Array index out of bound");
		}
		//Exception is parent class of all other exceptions
		catch(Exception ae) {
			System.out.println("Exception "+ae);
		}

	}

}
