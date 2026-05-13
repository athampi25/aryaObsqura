package hierarchicalInheritance;

public class Daughter extends Father {
	public void daughterMethod(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Daughter d =new Daughter();
		d.fatherMethod("I am father");
		d.daughterMethod("I am daughter");
		//d.sonMethod("I am son");

	}

}
