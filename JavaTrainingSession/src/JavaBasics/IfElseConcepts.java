package JavaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {

		// if else condition

		int a = 40;
		int b = 30;

		if(b>a) 
		{
			System.out.println("b is greaterthan a");
		}
		else 
		{

			System.out.println("a is greater than b");
		}
		
		//comparison operator
		
		int c = 40;
		int d = 40;
		
		if(c==d) {
			
			System.out.println("C  and D  are equal");
			
		}else {
			
			System.out.println("C and D are not Equal");
		}
		
		//write a logic to find the highest number
		
		int a1 =400;
		int b1= 600;
		int c1 = 300;
		
		//nested if else
		
		if (a1>b1 && a1> c1) {
			
			System.out.println("a1 is greater than b1 and c1");
			
		}else if (b1>c1) {
			
			System.out.println("b1 is greatest");
		}else {
			
			System.out.println("c1 is greatest");
		}

	}

}
