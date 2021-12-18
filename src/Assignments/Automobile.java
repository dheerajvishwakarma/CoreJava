package Assignments;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public int NO_OF_GEARS;

	public void setColor (String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed (int speed) {
		this.speed = speed;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake (String make) {
		this.make = make;
	}
	public void setNO_OF_GEARS(int NO_OF_GEARS){
		this.NO_OF_GEARS = NO_OF_GEARS;
	//	for (int i = speed; i < 140; i++) {
			
			if (speed<20) {
				System.out.println("1st gear"+speed);
				
			}
			else if (speed<=50) {
				System.out.println("2nd Gear"+speed);
				
			}
			else if (speed<=120) {
				System.out.println("3rd gear"+speed);
			}
			else {
				System.out.println("5th gear"+speed);
				
			}
		}

	public int getNO_OF_GEARS() {
		return NO_OF_GEARS;
	}
	
}


