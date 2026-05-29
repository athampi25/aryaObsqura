package assignment;

public class Factorial {
	
	public int findFactorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}

	public void printFact() {
		int fact= this.findFactorial(5);
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.printFact();

	}

}
