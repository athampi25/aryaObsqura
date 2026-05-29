package polymorphism;

public class MethodOverLoading {
	public void sampleMethod() {
		System.out.println("This is sample method");
	}
	
	public void sampleMethod(int a, int b) {
		int sum =a+b;
		System.out.println(sum);
	}
	
	public void sampleMethod(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.sampleMethod();
		m.sampleMethod(2, 4);
		m.sampleMethod("hello");

	}

}
