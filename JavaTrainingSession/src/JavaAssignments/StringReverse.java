package JavaAssignments;

public class StringReverse {

	public static void main(String[] args) {
		
		
		String s = "swetank";
		char ch;
		String nstr="";
		
		System.out.println("Original  Word:- "+s);
		
		for(int i=0;i<s.length();i++) {
			
			ch = s.charAt(i);
			nstr = ch+nstr;
			
			
		}
		System.out.println("Reverse  Word:- "+nstr);
		
		
		
		
	//	;

		

	}

}
