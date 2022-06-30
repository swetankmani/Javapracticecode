package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//String to int conversion
		
		String x= "100";
		System.out.println(x+20);
		Integer t  = Integer.parseInt(x);
		System.out.println(t+20);
		
		//String to double conversion
		
		String p= "120";
		System.out.println(p);
		Double d = Double.parseDouble(p);
		System.out.println(d);
		System.out.println(d+10);
		
		//String to boolean
		
		String g= "21";
		System.out.println(g);
		Boolean b= Boolean.parseBoolean(g);
		System.out.println(b);
		
		//Int to string conversion
		
		int c = 10;
		System.out.println(c);
	String k=String.valueOf(c);
	System.out.println(k+30);

	}

}
