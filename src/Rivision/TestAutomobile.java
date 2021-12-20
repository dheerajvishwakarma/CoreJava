package Rivision;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile A= new Automobile();
		A.setColor("Color : "+"B L A C K");
		
		System.out.println(A.getColor());
		
		A.setMake("Make : "+"T A T A");
		
		System.out.println(A.getMake());
		
		A.setSpeed(80);
		System.out.println("Speed :"+A.getSpeed());
	}

}
