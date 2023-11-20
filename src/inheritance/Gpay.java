package inheritance;

public class Gpay extends Upi {

	String rewards;
	String offers;
	String email;
	
	public Gpay() {
		
	}
	
	public Gpay(long accno,String bank,long phno,int pin,String rewards,String offers,String email) {
		super(accno,bank,phno,pin);
		this.rewards=rewards;
		this.offers=offers;
		this.email=email;
		System.out.println("Gpay value are loaded");
		
	}
	
	public void displayGpay() {
		System.out.println("Gpay details are ");
		System.out.println(accno);
		System.out.println(bank);
		System.out.println(phno);
		System.out.println(pin);
		System.out.println(rewards);
		System.out.println(offers);
		System.out.println(email);
	}
	
}
