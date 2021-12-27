package christmes;

public class ChieldOverride extends ParentOverride{

	public void test() {
		System.out.println("Chield test method");
	}
	
	public static void main(String[] args) {
		
		ChieldOverride chieldOverride = new ChieldOverride();
		chieldOverride.test();

		ParentOverride parentOverride = new ParentOverride();
		parentOverride.test();
	}
}
