package ExceptionHandling;

public class TryCatch1 {
	public static void main(String[] args) throws ArithmeticException {
		// double div= 50/0; //Exception in thread "main" java.lang.ArithmeticException:
		// / by zero
//		System.out.println(div);								//	at ExceptionHandling.TryCatch1.main(TryCatch1.java:5)

		try {
			String A = "Dheeru";

			System.out.println(A.charAt(8));

		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		}
		try {
			double div = 15 / 0;
			System.out.println(div);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
