package accessModifier;

public class AccessModifierDefault {

	void defaultMethod() {
		System.out.println("This is default method");
	}
	public static void main(String[] args) {
		AccessModifierDefault a = new AccessModifierDefault();
		a.defaultMethod();

	}

}
