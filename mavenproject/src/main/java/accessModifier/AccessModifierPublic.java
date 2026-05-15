package accessModifier;

public class AccessModifierPublic {

public void add(int a, int b) {
		
		int sum= a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		AccessModifierPublic a = new AccessModifierPublic();
		a.add(3, 8);
	}

}
