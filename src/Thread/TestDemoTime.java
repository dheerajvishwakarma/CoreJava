package Thread;

public class TestDemoTime {
	public static void main(String[] args) {
		
		DemoThreadWithTime t1 =new DemoThreadWithTime ("Virat");
		DemoThreadWithTime t2 = new DemoThreadWithTime("Dheoni");
		
		t1.start();
		t2.start();
	}

}
