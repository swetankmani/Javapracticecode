package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(3, 5);
	

	}

	
	public void sum() {
		
		System.out.println("SumMethod -ZeroParameter");
	 
	}
	
	public void sum(int i) {
		
		System.out.println("Sum method with one parameter");
		System.out.println(i);
	}
	
	public void sum(int j,int k) {
		
		System.out.println("Sum method with two input parameter");
		System.out.println(j);
		System.out.println(k);
		System.out.println(j+k);
	}
	
}
