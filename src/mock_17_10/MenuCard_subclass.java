package mock_17_10;

public class MenuCard_subclass extends MenuCard_super{

	
	
	MenuCard_subclass(){
		
	}
	
	public MenuCard_subclass(String food){
		super(food);
	}
	
	public void display() {
		System.out.println(food);
		System.out.println("From child class");
	}

	

}
