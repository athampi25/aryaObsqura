package assignment;

public class ReverseNumber {
	int num;
	public ReverseNumber(int num) {
		this();
		this.num=num;
		int rev=0;
		while(num!=0) {
			int d= num%10;
			rev= rev*10+d;
			num=num/10;
		}
		System.out.println(rev);
	}
	public ReverseNumber() {
		System.out.println("Finding reverse...");
	}
	public static void main(String[] args) {
		ReverseNumber r = new ReverseNumber(35);

	}

}
