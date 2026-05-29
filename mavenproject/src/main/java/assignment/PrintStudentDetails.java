package assignment;

public class PrintStudentDetails {
	String address;
	GetStudentNameAndRollNumber g;
	
	public  PrintStudentDetails(String address, GetStudentNameAndRollNumber g ) {
		this.address=address;
		this.g=g;
	}
	
	public void printStudentDetails() {
		System.out.println(g.name);
		System.out.println(g.rollNUmber);
		System.out.println(address);
	}

	public static void main(String[] args) {
		GetStudentNameAndRollNumber get = new GetStudentNameAndRollNumber(623,"Sanvi");
		PrintStudentDetails p= new PrintStudentDetails("Sage Hill Path", get);
		
		p.printStudentDetails();

	}

}
