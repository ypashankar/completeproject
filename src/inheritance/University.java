package inheritance;

public class University {

	String uniname;
	String loc1;
	long unid;
	
	public University() {
		
	}
	
	public University(String uniname,String loc1,long unid) {
		this.uniname=uniname;
		this.loc1=loc1;
		this.unid=unid;
	}
	
	public void displayUni() {
		System.out.println(uniname);
		System.out.println(loc1);
		System.out.println(unid);
		System.out.println("-----------");
	}

}
