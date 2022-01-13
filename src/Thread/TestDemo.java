package Thread;

public class TestDemo {
	public static void main(String[] args) {
		
		DemoThread t1 =new DemoThread ("Virat");
		DemoThread t2 = new DemoThread ("Dheoni");
		
		t1.start();
		t2.start();
	}

}
