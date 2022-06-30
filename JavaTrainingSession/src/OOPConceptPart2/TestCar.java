package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		System.out.println("********************");
		
		car c = new car();
		c.start();
		c.start();
		c.refuel();
		c.Engine();
		b.Engine();
		
	}

}
