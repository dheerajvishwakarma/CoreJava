package Exercise;

public class Palindrome {
	public static void main(String[] args) {
		int num = 120, rev = 0, rem, temp;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev)
			System.out.println("palindrome number ");
		else
			System.out.println("Not palindrome");

	}

}
