package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// 

		FunctionsInJava f =new FunctionsInJava();
		
		f.test();
		int a = f.pqr();
		System.out.println(a);
		String p = f.qa();
		System.out.println(p);
		int j = f.divison(20, 10);
		System.out.println(j);
		
		
	}
	
	public void test()
	{
		System.out.println("Test Method");
	}
	
		

	public int pqr() 
	{
		System.out.println("PQR Method");
		int a = 10;
		int b= 20;
		int c = a+b;
		return c;	
	}

	public String qa() {
		
		System.out.println("QA Method");
		String s="Selenium";
		return s;
		
	} 
	
	public int divison(int x,int y) {
		
		System.out.println("Divison method");
		int d=x/y;
		 return d;
	}
}
