package ExceptionHandling;

public class TryTryCAtch {
public static void main(String[] args) {
	

	try {
		try {
			double div = 15 / 0;
			System.out.println(div);
		String A = "Dheeru";
		System.out.println(A.charAt(8));

	

		}
	 catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());

}}

	catch (StringIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());

	}
}}