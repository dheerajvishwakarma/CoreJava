package learning;

public class TestConstLearning {

	public static void main(String[] args) {

		ConsLearning consLearning = new ConsLearning("Param1Value", "Param2Value");

		System.out.println(consLearning.getVariable1());
		System.out.println(consLearning.getVariable2());
		System.out.println(consLearning.getVariable3());

	}
}
