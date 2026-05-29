package assignment;

import java.util.Scanner;

public class GetBasicDeductionBonus {
	double basic;
	double deduction;
	double bonus;

	void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basic = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }
		

	}


