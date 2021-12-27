package Assignments;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile a = new Automobile();
		a.setColor("RED");
		a.setSpeed(20);
		a.setMake("Honda");
		a.setNO_OF_GEARS(5);
		String c = a.getcolor();

		System.out.println("Car Maker: " + a.getMake());
		System.out.println("Color of car: " + a.getcolor());
		System.out.println(a.getNO_OF_GEARS());
		System.out.println("Speed of car: " + a.getSpeed());

	}
}
