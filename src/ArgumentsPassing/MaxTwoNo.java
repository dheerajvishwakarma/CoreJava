package ArgumentsPassing;

import java.util.Scanner;

// user can set the value 
public class MaxTwoNo {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int i = c.nextInt();
		System.out.println("value of X is " + i);
		int j = c.nextInt();
		System.out.println("value of y is Y " + j);

		// with the help of scanner we can use mathematical operations when user can set
		// the value
		System.out.println(i + j);
	}

}
