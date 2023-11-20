package inheritance;

public class Upi {

	long accno;
	String bank;
	long phno;
	int pin;
	
	public Upi() {
		
	}
	
	public Upi(long accno,String bank,long phno,int pin) {
		this.accno=accno;
		this.bank=bank;
		this.phno=phno;
		this.pin=pin;
		System.out.println("Upi details are loaded");
	}
	
	public void displayUpi() {
		System.out.println("Upi details are");
		System.out.println(accno);
		System.out.println(bank);
		System.out.println(phno);
		System.out.println(pin);
	}
}
