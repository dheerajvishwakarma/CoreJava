package co.in.rays;

public class Shape {
	public static void main(String[] args) {
		

GetSet s = new GetSet();
s.setBorderWidth(6);
s.setColor("Blue");
String c = s.getColor();
System.out.println(c);
int b = s.getBorderWidth();
System.out.println(b);

	
}
}