package StringClass;

public class Declaration {
	// Method Declaration
	public static int add (int a, int b) {
		return a+b;
		
	}
	public static void main(String[]args) {
		int a=10;
		int b=20;
		int c=a+b ;
		Declaration ab= new Declaration();
		Declaration.add(a,b);
		System.out.println(c);
		
	} 

}
