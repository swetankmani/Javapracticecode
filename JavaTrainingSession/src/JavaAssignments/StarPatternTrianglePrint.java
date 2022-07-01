package JavaAssignments;

public class StarPatternTrianglePrint {

	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x=0;x<=4;x++) {
			for(int y=3;y>=x;y--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
