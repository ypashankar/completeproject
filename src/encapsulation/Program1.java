package encapsulation;

public class Program1 {

	private String bank="HDFC";
	private String ifsc="HDFC1234";
	private String acctype="SAVING";
	private String name="Yogesh";
	private long accno=1234567890l;
	private float balance=90.0f;
	private int pin=1234;
	
	public String getname() {
		return name;
	}
	public long getaccno() {
		return accno;
	}
	
	public float getbalance(long accno,int pin) {
	
		if(accno==this.accno && pin==this.pin) {
			return balance;
		}
		else {
			System.out.println("Enter valid credentials");
			return 0;
		}
		
		
	}
	
		
	}


