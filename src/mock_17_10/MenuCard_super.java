package mock_17_10;

public class MenuCard_super {

	String food;
	
	MenuCard_super(){
		
	}
	
	MenuCard_super(String food){
		this.food=food;
	}
	public void display() {
		System.out.println(food);
		System.out.println("From super class");
	}
	
}
