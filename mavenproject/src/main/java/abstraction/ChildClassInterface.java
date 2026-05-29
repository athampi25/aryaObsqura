package abstraction;

public class ChildClassInterface implements ParentInterface {
 
	public void childMethod() {
		System.out.println("This is child method");
	}
	public static void main(String[] args) {
		ChildClassInterface c= new ChildClassInterface();
		c.childMethod();
		c.abstractMethod();

	}

	@Override
	public void abstractMethod() {
		System.out.println("Calling the abstarct method");
		
	}

}
