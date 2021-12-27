package Exercise;

public class CharCount {
	public static void main(String[] args) {

		int wordCount = 0;
		String word = "Vijay Dinanath Chouhan";

		for (char latter = 'A'; latter <= 'z'; latter++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == latter) {
					wordCount++;
				}

			}
			if (wordCount > 0) {
				System.out.println(latter + "=" + wordCount);
				wordCount = 0;
			}
		}

	}
}