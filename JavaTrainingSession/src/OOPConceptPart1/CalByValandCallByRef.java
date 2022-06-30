package OOPConceptPart1;

public class CalByValandCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CalByValandCallByRef obj=new CalByValandCallByRef();
		obj.sum(3, 5);//Call by value
		System.out.println("The sum is :- "+obj.sum(4, 6));
		obj.p=22;
		obj.q=23;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	
	public int sum(int a ,int b) {
		
		int c=a+b;
		return c;
		
		
	}
	
	public void swap(CalByValandCallByRef t) {
		int temp;
		temp=t.p;
		t.p = t.q;
		t.q=temp;
		
		
		
		
	}

}
