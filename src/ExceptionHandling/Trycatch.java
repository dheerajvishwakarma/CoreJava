package ExceptionHandling;

public class Trycatch {

	public static void main(String[] args) {
		try {
			double div= 50/0;
		System.out.println(div);
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println(e.getMessage());	
		}
	}
}
