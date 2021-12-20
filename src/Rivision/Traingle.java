package Rivision;

public class Traingle extends Shape {
	private int base;
	private int height;

	
	public int getBase() {
		return base;
	}

	
	public void setBase(int base) {
		this.base = base;
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	 public void area() {
		 double area=((0.5)*base*height);
		 System.out.println("Area of Traingle : "+ area);
	 }
}