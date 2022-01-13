package Thread;

public class TestHelloThread {
	public static void main(String[] args) {
		DemoThread t1 = new DemoThread("Virat");
		DemoThread t2 = new DemoThread("Dheoni");

		Thread th = new Thread(t1);
		Thread tt = new Thread(t2);

		th.start();
		tt.start();

	}

}
