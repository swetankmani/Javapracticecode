package JavaBasics;

public class BSuperConstructor extends ASupreConstrucror {
	
	public BSuperConstructor() {
		
		super();
	}
	
	public BSuperConstructor(int x) {
		
		super(x);
	}
	
public BSuperConstructor(int x,int y) {
		
		super(x,y);
	}
	

	public static void main(String[] args) {
		
		
		
		BSuperConstructor b = new BSuperConstructor();
		BSuperConstructor b1 = new BSuperConstructor(1);
		BSuperConstructor b2 = new BSuperConstructor(1,2);
		
	}

}
