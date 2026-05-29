package polymorphism;

public class ChildMethodOverriding extends Parent {

	public void parentMethod(String str) {
		//super.parentMethod("Calling Parent Method");
		System.out.println("Child method "+str);
	}
	public static void main(String[] args) {
		ChildMethodOverriding c = new ChildMethodOverriding();
		c.parentMethod("Calling Child method");
		//Upcasting
		Parent p = new ChildMethodOverriding();
		p.parentMethod("Calling Child method in another way");

	}

}
