package superKeyword;

public class Son extends Mother {
	public Son(String s) {
		super("Mother");
		System.out.println("This is Son constructor "+s);
	}

	public static void main(String[] args) {
		Son s = new Son("Son");

	}

}
