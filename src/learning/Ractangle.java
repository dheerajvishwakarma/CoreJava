package learning;

/**
 * @author VISHWAKARMA
 *
 */
public class Ractangle extends Shape{
	private int length;
	private int width;
	
	public Ractangle() {
		
	}
	public Ractangle (int l, int w) {
		length=l;
		width=w;
		
	}
	
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
public double area() {
	double area=length*width;
	System.out.println("area of Ractangle is;"+area);
	return area;
}
}
