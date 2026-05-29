package assignment;

public class Area {

	public void findArea(int l, int b) {
		int area = l*b;
		System.out.println("Area of rectangle is "+area);
	}
	public void findArea(int a) {
		int area = a*a;
		System.out.println("Area of square is "+area);
	}
	public void findArea(double r) {
		double area = 3.14*r*r;
		System.out.println("Area of circle is "+area);
	}
	public static void main(String[] args) {
		Area a = new Area();
		a.findArea(7.5);
		a.findArea(5);
		a.findArea(3,4);

	}

}
