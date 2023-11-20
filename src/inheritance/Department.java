package inheritance;

public class Department extends College{

	String deptname;
	int studentstrength;
	
	public Department() {
		
	}
	
	public Department(String uniname,String loc1,long unid,String colname,long colid,String loc,String deptname,int studentstrength) {
		
		this.uniname=uniname;
		this.loc1=loc1;
		this.unid=unid;this.colname=colname;
		this.colid=colid;
		this.loc=loc;
		this.deptname=deptname;
		this.studentstrength=studentstrength;
	}
	
	public void displaydept() {
		System.out.println(deptname);
		System.out.println(studentstrength);
		
	}
}
