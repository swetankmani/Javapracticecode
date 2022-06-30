package OOPConceptPart1;

public class StaticandNonStatic {
	
	String name = "Swetank";//non static variables
	static int  age=25;//static  global variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to call static method and vars
		//1.direct calling
		sum();
		//2.callling by classname
		StaticandNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticandNonStatic.age);
		
		//how to  call non static variables  and methods
		
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.sendMail();
		System.out.println(obj.name);

	}
	
	public void sendMail() {
		
		System.out.println("Send mail method");
		
	}
	
	public static void sum() {
		
		System.out.println("Sum  Method");
		
	}

}
