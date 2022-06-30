package OOPConceptPart1;

public class Car {
	
	//Global variables
	//car variables
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		Car a=new Car();
		Car b=new  Car();
		Car c=new Car();
		
		a.mod= 2017;
		a.wheel=4;
		
		b.mod= 2018 ;
		b.wheel=5;
		
		c.mod= 2019 ;
		c.wheel=6;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		

	}

}
