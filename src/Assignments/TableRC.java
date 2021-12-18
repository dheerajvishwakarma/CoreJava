package Assignments;

public class TableRC {

	public static void main(String[] args) {
		int[][] Table = new int[9][10];
		for (int i = 0; i < Table.length; i++) {
			System.out.println("");
			for (int j = 1; j < Table.length; j++) {
				int S = (i + 1) * j;
				System.out.print("	 " + S);

			}
		}
	}
}
