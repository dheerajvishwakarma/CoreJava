package Deccristmus;

public class Traingle extends Shape {
	
	private int base;
	private int height;
	public Traingle() {
	}
	
	public Traingle(int b,int h) {
		base=b;
		height=h;
		
		
	}
	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	public double area()
	{
		double area=((0.5)*base*height); 
		System.out.println("Atea of Traingle is;"+ area);
		return area;
	}
	
	

}
