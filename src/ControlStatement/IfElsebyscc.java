package ControlStatement;

import java.util.Scanner;

public class IfElsebyscc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a <= in.nextInt()) {
			System.out.println("Yes");

		} else if (a >= in.nextInt()) {
			System.out.println("No");

		} else {
			System.out.println("May be");
		}
	}

}
