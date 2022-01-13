package Thread;

public class ExtewndImpliment extends DemoThread implements Runnable{
	public ExtewndImpliment(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DemoThread t1 = new DemoThread("Virat");
		DemoThread t2 = new DemoThread("Dhoni");

		Thread th = new Thread(t1);
		Thread tt = new Thread(t2);

		th.start();
		tt.start();

	}

}
