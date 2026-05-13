package multiLevelInheritance;

public class Son extends Father {
	public void sonMethod(String st) {
		System.out.println(st);
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.grandFatherMethod("This is grandfather method");
		s.fatherMethod("This is father method");
		s.sonMethod("This is son method");
		

	}

}
