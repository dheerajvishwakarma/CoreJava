package ExceptionHandling;

public class TestLoginone {
	public static void main(String[] args) {
		auth("Dheeru");

	}

	private static void auth(String name) {
		// TODO Auto-generated method stub
		if (!name.equals("admin")) {
			LoginException e = new LoginException();
			try {
				throw e;
			} catch (LoginException e1) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}

	}

}
