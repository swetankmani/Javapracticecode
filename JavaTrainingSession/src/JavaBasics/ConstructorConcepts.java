package JavaBasics;

public class ConstructorConcepts {
	
	
	public ConstructorConcepts() {
		System.out.println("There is  no  parameter in this constructor");
	}

	public ConstructorConcepts (int x) {
		
		System.out.println(x);
	}
	
	public ConstructorConcepts(int x,int y) {
		
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		ConstructorConcepts q =new  ConstructorConcepts();
		ConstructorConcepts q1= new ConstructorConcepts(10);
		ConstructorConcepts q2 = new ConstructorConcepts(10,12);
		

	}

}
