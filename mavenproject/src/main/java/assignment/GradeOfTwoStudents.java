package assignment;

public class GradeOfTwoStudents {
	public GradeOfTwoStudents(String name, int s1,int s2,int s3) {
		int total= s1+s2+s3;
		int averagemark = total/3;
		if(averagemark>=85) {
			System.out.println("Grade of "+name+" is A");
		}
		else if(averagemark<85 && averagemark>=70) {
			System.out.println("Grade of "+name+" is B");
		}
		else if(averagemark<70 && averagemark>=60) {
			System.out.println("Grade of "+name+" is C");
			
		}
		else if(averagemark<60 && averagemark>=45) {
			System.out.println("Grade of "+name+" is D");
			
		}
		else {
			System.out.println("Grade of "+name+" is F");
		}
	}

	public static void main(String[] args) {
		GradeOfTwoStudents g1 = new GradeOfTwoStudents("Naya",40,70,80);
		GradeOfTwoStudents g2 = new GradeOfTwoStudents("Myra",90,79,88);

	}

}
