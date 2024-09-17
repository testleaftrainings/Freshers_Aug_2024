package week5.day1;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Testleaf";

		char[] charArray = input.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {

			System.out.print(charArray[i]);
		}

	}

}
