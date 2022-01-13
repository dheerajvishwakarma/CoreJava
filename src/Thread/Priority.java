package Thread;

public class Priority extends DemoThread implements Runnable {

	public Priority(String n) {
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
		
		th.setPriority(MAX_PRIORITY);
		tt.setPriority(MIN_PRIORITY);
		

	}


}
