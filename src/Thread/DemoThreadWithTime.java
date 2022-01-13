package Thread;

import java.security.PublicKey;

public class DemoThreadWithTime extends Thread {
	private String name;
	public DemoThreadWithTime(String n) {
		name = n;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println(i + name);

		}

	}
}
