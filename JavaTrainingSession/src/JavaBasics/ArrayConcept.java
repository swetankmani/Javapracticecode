package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// int array
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i.length);
		
		for (int j=0; j<i.length; j++) {
			
			System.out.println(i[j]);
			
		}
		
		//double
		
		double d[] = new double[3];
		d[0]=1.1;
		d[1]=2.1;
		d[2]=3.1;
		
		
		System.out.println(d[1]);
		
		
		//boolean
		boolean b[]=new boolean[2];
		
		b[0]=true;
		b[1] =false;
		
		
	//string
		
		String s[]=new  String[2];
		s[0]="test";
		s[1]="hello";
	//	s[2] ="world";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//Object array-is used to store different data types value
		
		Object ob[] = new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.32;
		ob[3]=6/29/2022;
		ob[4]='r';
		ob[5]="london";
		System.out.println(ob[0]);
		System.out.println(ob[1]);
		System.out.println(ob[2]);
		System.out.println(ob[3]);
		System.out.println(ob[4]);
		System.out.println(ob[5]);
//		System.out.println(ob[6]);
		

	}

}
