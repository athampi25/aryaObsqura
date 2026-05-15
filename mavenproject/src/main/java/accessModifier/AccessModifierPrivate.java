package accessModifier;

public class AccessModifierPrivate {

	private void add(int a, int b) {
		
		int sum= a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		AccessModifierPrivate a= new AccessModifierPrivate();
		a.add(3, 7);

	}

}
