package multipleInheritance;

public class Child implements MotherInterface,FatherInterface{
	
	public void childMethod() {
		System.out.println("Calling child");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.childMethod();
		c.fatherMethod();
		c.motherMethod();

	}

	@Override
	public void fatherMethod() {
		System.out.println("Calling parent 1");
		
	}

	@Override
	public void motherMethod() {
		System.out.println("Calling parent 2");
		
	}

}
