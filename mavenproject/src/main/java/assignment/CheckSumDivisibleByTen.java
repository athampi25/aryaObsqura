package assignment;

public class CheckSumDivisibleByTen extends AdditionalResult {
	
	public void check(int a, int b) {
		int sum= super.add(a,b);
		if(sum%10==0) {
			System.out.println("Sum is divisible by 10");
		}
		else {
			System.out.println("Sum is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		CheckSumDivisibleByTen c = new CheckSumDivisibleByTen();
		c.check(20,33);

	}

}
