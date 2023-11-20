package mock_17_10;

public class LaptopDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=new Laptop("hp",4,5000,500,50000.00);
		System.out.println(l.getbattery());
		System.out.println(l.getram());
		l.setram(250,8);
		System.out.println(l.getbattery());
		System.out.println(l.getram());
	}

}
