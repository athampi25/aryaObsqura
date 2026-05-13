package singleInheritence;

public class Child extends Parent{
	public void childMethod() {
		System.out.println("This is child method");
	}

	public static void main(String[] args) {
		// Create child class object for single inheritance
		Child c =new Child();
		c.childMethod();
		c.parentMethod();

	}

}
