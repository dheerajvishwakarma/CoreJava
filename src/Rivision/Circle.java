package Rivision;

public class Circle extends Shape{
	private int radious;

	/**
	 * @return the radious
	 */
	public int getRadious() {
		return radious;
	}

	/**
	 * @param radious the radious to set
	 */
	public void setRadious(int radious) {
		this.radious = radious;
	}
	public void area() {
		double area=((3.14)*radious*radious);
		System.out.println("Area of Circle : "+ area);
	}
	

}
