package learning;

public class ConsLearning {

	public String variable1;
	public String variable2;
	public String variable3;

	public ConsLearning() {
		System.out.println("Default cons");
	}

	public ConsLearning(String var1) {
		System.out.println("1 param cons");
		this.variable1 = var1;
	}

	public ConsLearning(String var1, String var2) {
		System.out.println("2 param cons");
		this.variable1 = var1;
		this.variable2 = var2;
	}

	public ConsLearning(String var1, String var2, String var3) {
		System.out.println("3 param cons");
		this.variable1 = var1;
		this.variable2 = var2;
		this.variable3 = var3;
	}

	public String getVariable1() {
		return variable1;
	}

	public String getVariable2() {
		return variable2;
	}

	public String getVariable3() {
		return variable3;
	}

}
