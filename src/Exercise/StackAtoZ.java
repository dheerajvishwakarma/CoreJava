package Exercise;

import java.util.Iterator;
import java.util.Stack;

public class StackAtoZ {
	public static void main(String[] args) {

		Stack s1 = new Stack();
		Stack s2 = new Stack();
		Stack s3 = new Stack();

		s1.push('A');
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);

		for (char i = 'A'; i <= 'Z'; i++) {
			s1.push(i);

		}

		System.out.print("s1 Stack: " + s1);
		System.out.println(" ");

		for (char i = 'A'; i <= 'Z'; i++) {
			s2.push(s1.pop());

		}
		System.out.println("s1 stack: " + s1);
		System.out.println(" ");
		System.out.println("s2 Stack: " + s2);

		for (char i = 'Z'; i >= 'A'; i--) {
			s3.push(s2.pop());
		}
		System.out.println("s1 stack: " + s1);
		System.out.println(" ");
		System.out.println("s2 Stack: " + s2);
		System.out.println("s3 Stack: " + s3);

	}
}
