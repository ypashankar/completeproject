package inheritance;

public class College extends University {

	String colname;
	long colid;
	String loc;
	
	public College() {
		
	}

	public College(String uniname,String loc1,long unid,String colname,long colid,String loc) {
	
		this.uniname=uniname;
		this.loc1=loc1;
		this.unid=unid;
		this.colname=colname;
		this.colid=colid;
		this.loc=loc;
		
	}
	
	public void displaycollege() {
		System.out.println(colname);
		System.out.println(colid);
		System.out.println(loc);
		System.out.println("-----------");
	}

}
