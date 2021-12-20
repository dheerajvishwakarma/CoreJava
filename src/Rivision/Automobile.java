package Rivision;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	private int noOfGears;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;

		if (speed <= 20) {
			System.out.println("1st Gear" + speed);
		} else if (speed <= 40) {
			System.out.println("2nd Gear" + speed);
		} else if (speed < 60) {
			System.out.println("3rd Gear" + speed);
		} else if (speed < 90) {
			System.out.println("4th Gear" + speed);
		} else {
			System.out.println("5th Gear" + speed);
		}
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the noOfGears
	 */
	public int getNoOfGears() {
		return noOfGears;
	}

	/**
	 * @param noOfGears the noOfGears to set
	 */
	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

}
