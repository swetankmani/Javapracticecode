package OOPConceptPart2;

import java.io.IOException;


public class FinallyConcepts {

	public static void main(String[] args) {
		
		
		//test1();
		//test2();
		division();

	}
	
	public static void test1() {
		
		try {
			
			System.out.println("I am in test1  try block");
			throw new RuntimeException("Test");
		}catch(Exception e) {
			
			System.out.println("I amin test1 catch");
		}
		finally{
		System.out.println("I am in test1 finally ");	
		}
	}
	
	public static void test2() 
	{
		
		try {
			
			System.out.println("I am in test2  try");
			
			}
		finally {
			
			System.out.println("I  am  in finally test2");
				}
			
	}

	
	public  static void division() {
		
		int i=2;
		try {
			
		
			System.out.println("Iam in Division try");
			int k = i/ 0;
			
			
		}catch(ArithmeticException e) {
			
			System.out.println("I am under catch arithmetic exception");
			System.out.println(e);
			
		}finally {
			
			
			System.out.println("I am under the division finally block");
			
			
		}
		
		
	}
}
