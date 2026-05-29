package accessModifier;

public class AccessModifierProtected {
 protected void protectedMethod() {
	 System.out.println("This is protected method");
 }
	public static void main(String[] args) {
		AccessModifierProtected a = new AccessModifierProtected();
		a.protectedMethod();

	}

}
