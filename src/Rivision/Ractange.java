package Rivision;

public class Ractange extends Shape{
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	
	}
	public void setWidth(int width) {
		this.width = width;
	}
		public void area () {
			double area =(length*width);
			System.out.println("Area of Ractangle is : "+ area);
		}
		
			
		
	}


