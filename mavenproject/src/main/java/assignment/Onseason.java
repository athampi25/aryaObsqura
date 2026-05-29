package assignment;

public class Onseason extends Offseason {
	public double calDiscount(double amount,String season) {
		double discountedAmount ;
		if(season.equals("Offseason"))
		{
			discountedAmount=super.calDiscount(amount, season);
		}
		else  {
			discountedAmount= amount-(0.4*amount);
		}
		return discountedAmount;
		
	}

	public static void main(String[] args) {
		Onseason on =new Onseason();
		double total=on.calDiscount(2345.78, "Onseason");
		System.out.println(total);

	}

}
