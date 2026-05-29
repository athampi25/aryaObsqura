package aggregation;

public class MainMethod {
 int c;
 int d;
 //aggregation
 Aggregation a;
 public MainMethod(int c,int d, Aggregation a) {
	this.c=c;
	this.d=d;
	this.a=a;
 }
 public void print() {
	 System.out.println(a.a);
	 System.out.println(a.b);
	 System.out.println(c);
	 System.out.println(d);
 }
	public static void main(String[] args) {
		Aggregation agr = new Aggregation(3,5);
		MainMethod m = new MainMethod(6, 8,agr);
		m.print();

	}

}
