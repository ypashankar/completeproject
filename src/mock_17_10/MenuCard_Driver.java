package mock_17_10;

import java.util.Scanner;

public class MenuCard_Driver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a food name");
		String food=sc.next();
		
		MenuCard_super m=new MenuCard_subclass(food);
		m.display();
	}
	
	
	

}
