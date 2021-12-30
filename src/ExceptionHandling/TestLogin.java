package ExceptionHandling;

public class TestLogin {
	public static void main(String[] args) throws LoginException {
		auth("Dheeru");

	}

	private static void auth(String name) throws LoginException {
		// TODO Auto-generated method stub
		if (!name.equals("admin")) {
			LoginException e = new LoginException();
			throw e;

		}
	}
}
