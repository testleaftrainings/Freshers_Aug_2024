package week5.day1;

public class LearnString {

	public static void main(String[] args) {

		// String literal
		String str = "testleaf";

		String str1 = "testleaf";

		// String Instance

		String name = new String("testleaf");

		if (str == str1) {

			System.out.println("Stored in same  Address");
		}

		if (str.equals(str1)) {

			System.out.println("Stored in Same value");
		}

	}
}
