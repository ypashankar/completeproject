package mock_17_10;

public class Mobile{      //Constructor chaining 

	String mname;
	int mid;
	double price;
	String color;
	
	public Mobile() {
	System.out.println("from default constructor");	
}
	public Mobile(String mname) {
		this.mname=mname;
	}
	
	public Mobile(String mname,int mid) {
		this(mname);
		this.mid=mid;
	}
	
	public Mobile(String mname,int mid,double price) {
	this(mname,mid);
	this.price=price;
	}
	
	public Mobile(String mname,int mid,double price,String color) {
		this(mname,mid,price);
		this.color=color;
	}
	
	public void display() {
		System.out.println(mname);
		System.out.println(mid);
		System.out.println(price);
		System.out.println(color);
	}
	}


