package assignment;

public class Average {
	public void findAverage(int a, int b, int c) {
		float avg = (a+b+c)/3f;
		System.out.println(avg);
	}
	public void findAverage(float a, float b, float c) {
		float avg = (a+b+c)/3f;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		Average a= new Average();
		a.findAverage(1, 7, 15);
		a.findAverage(3.2f, 8.6f,1.2f);

	}

}
