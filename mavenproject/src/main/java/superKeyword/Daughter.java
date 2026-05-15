package superKeyword;

public class Daughter extends Father {
	public void fatherMethod() {
		//Method overriding parent and child class has same method with same name, return type and parameters
		System.out.println("This is Daughter method");
		super.fatherMethod();
	}

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.fatherMethod();

	}

}
