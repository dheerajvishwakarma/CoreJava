package StringClass;

public class stringclass {

	public static void main(String[] args) {

		String name = "Dheeraj Vishwakarma";

		System.out.println("String Length is : " + name.length());

		System.out.println("9th Character is : " + name.charAt(8));

		System.out.println("Vish index is 	 : " + name.indexOf("Vish"));

		System.out.println("First a position : " + name.indexOf("a"));

		System.out.println("Last a position  : " + name.lastIndexOf("a"));

		System.out.println("aj'sreplace by u : " + name.replace("aj", "u"));

		System.out.println("all a's rep by @ : " + name.replaceAll("a", "@"));

		System.out.println("small character  : " + name.toLowerCase());

		System.out.println("Capital character: " + name.toUpperCase());

		System.out.println("Start with Dheeru: " + name.startsWith("dheeru"));

		System.out.println("end with karma   : " + name.endsWith("karma"));

		System.out.println("Substring        : " + name.substring(8));
	}
}
