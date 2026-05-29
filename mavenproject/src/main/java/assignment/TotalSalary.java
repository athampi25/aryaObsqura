package assignment;

public class TotalSalary extends GetHraPf{
	double totalSal;
	
	public void CalTotalSal() {
		totalSal= basic+hra+bonus-pf-deduction;
	}
	public void printSalary() {
		System.out.println("------ Salary Slip ------");
        System.out.println("Basic Pay   : " + basic);
        System.out.println("Deduction   : " + deduction);
        System.out.println("HRA         : " + hra);
        System.out.println("PF          : " + pf);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Salary: " + totalSal);
	}
	public static void main(String[] args) {
		TotalSalary t = new TotalSalary();
		t.getInput();
		t.calculateHrapf();
		t.CalTotalSal();
		t.printSalary();

	}

}
