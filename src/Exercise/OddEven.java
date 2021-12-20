package Exercise;

public class OddEven {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int countOfEvenNumbers = 0, countOfOddNumber = 0, sumEven = 0, sumOdd = 0;
		while (n > 0) {
			if (n % 2 == 0) {
				countOfEvenNumbers++;
				sumEven = sumEven + n;
			} else {
				countOfOddNumber++;
				sumOdd = sumOdd + n;
			}
			n--;

		}
		int EvenAvg, oddAvg;
		EvenAvg = sumEven / countOfOddNumber;
		oddAvg = sumOdd / countOfOddNumber;
		System.out.println("Avg of 1st n even no:" + EvenAvg);
		System.out.println("Avg of 1st n odd no:" + oddAvg);

	}

}
