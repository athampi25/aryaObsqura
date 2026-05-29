package accessModifier;

public class TestPublic {

	public static void main(String[] args) {
		AccessModifierPublic b = new AccessModifierPublic();
		b.add(8, 9);
		AccessModifierDefault c = new AccessModifierDefault();
		c.defaultMethod();

	}

}
