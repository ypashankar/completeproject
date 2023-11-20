package mock_17_10;

public class Laptop {

	private String lname;
	private int ram;
	private int battery;
	private int hd;
	private double price;
	
	Laptop(){
		System.out.println("Default constructor");
	}
	
	Laptop(String lname,int ram,int bat,int hd,double price){
	
		this.lname=lname;
		this.ram=ram;
		battery=bat;
		this.hd=hd;
		this.price=price;
		System.out.println("Values are loaded successfully");
	}
	
	public int getram() {
		return ram;
	}
	
	public int getbattery() {
		return battery;
	}

	public void setram(int hd,int ram) {
		
		if(this.hd==hd) {
			this.ram=ram;
			System.out.println("RAM is updated");
		}else {
			System.out.println("RAM will not support ");
		}
	}
}	
