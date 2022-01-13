package Thread;

public class HelloThread implements Runnable {
	private String name;

	public HelloThread(String n) {
		name = n;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + name);

		}

	}
}
