package superKeyword;

public class Child extends Parent {
int a =7;
public void superMethod() {
	System.out.println("Child instance variable "+a);
	System.out.println("Parent instance variable "+super.a);
}
	public static void main(String[] args) {
		Child c= new Child();
		c.superMethod();

	}

}
