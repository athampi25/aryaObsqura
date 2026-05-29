package abstraction;

public class ChildClass extends Abstraction{

	public void childMethod() {
		System.out.println("This is child method");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.childMethod();
		c.abstractMethod();
		c.test();

	}

	@Override
	public void abstractMethod() {
		System.out.println("This is overriding method");
		
	}

}
