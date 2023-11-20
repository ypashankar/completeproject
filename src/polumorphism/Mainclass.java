package polumorphism;

public class Mainclass {

	public static void main(String[] args) {
		
		Superclass s=new Superclass();
		s.offer();
		
		Superclass c=new Subclass();
		c.offer();
		
		Superclass c1 =new ChildClass();
		c1.offer();
	}

}
