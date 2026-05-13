package hierarchicalInheritance;

public class Son extends Father{
	public void sonMethod(String st) {
		System.out.println(st);
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.fatherMethod("I am Father");
		s.sonMethod("I am son");

	}

}
