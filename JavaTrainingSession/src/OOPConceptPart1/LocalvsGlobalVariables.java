package OOPConceptPart1;

public class LocalvsGlobalVariables {
	
	//Global variables
	String name="Tom";
	int age = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalvsGlobalVariables var = new LocalvsGlobalVariables();
		
		int p=10;
		System.out.println(p);
		var.sum();
		var.name="John";
		var age1  = 9;
		
		System.out.println(var.name);
		System.out.println(var.age);

	}

	public void sum() {
		
		int i=25;
		int j =20;
		System.out.println(i);
		System.out.println(j);
		
		
		
	}
}
