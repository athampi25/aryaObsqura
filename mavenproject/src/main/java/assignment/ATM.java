package assignment;

public class ATM {
	private int pin;
	public void setPin(int pin) {
		this.pin=pin;
		
	}
	public void validatePin() {
		if(pin==1001||pin==1234||pin==1212) {
			System.out.println("Atm withdraw success");
		}
		else {
			System.out.println("Atm withdraw not success. Invalid PIN");
		}
	}

}
