package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =100;
		int b =200;

		String x = "Hello";
		String y ="World";

		double c = 11.22;
		double d =  13.23;

		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);

		System.out.println(x);
		System.out.println(y);
		System.out.println(x  + y);

		System.out.println(c);
		System.out.println(d);
		System.out.println(c+d);

		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);

		System.out.println(a+b+c+d);
		System.out.println(a+b+x+y+c+d);
		
		System.out.println("The value of a is: " +a);
		System.out.println("The value of b is:  " +b);
		System.out.println("The Addition of A and B is: " +(a+b));

	}

}
