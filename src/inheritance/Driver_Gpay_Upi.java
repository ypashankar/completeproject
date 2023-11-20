package inheritance;

public class Driver_Gpay_Upi {

	public static void main(String[] args) {
		
		Gpay g=new Gpay(12345l,"Hdfc",12245l,1234,"500rs off","50% off","yogrsh@gmail.com");
	
		//g.displayGpay();
		g.displayUpi();
	}

}
