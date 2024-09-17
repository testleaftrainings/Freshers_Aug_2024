package week5.day1;

public class LearnStringMethods {

	public static void main(String[] args) {
//
		String name = "Testleaf";
		
//		
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			System.out.println(charArray[i]);
			
		}

		String upperCase = name.toUpperCase();

		System.out.println(upperCase);

		String lowerCase = upperCase.toLowerCase();

		System.out.println(lowerCase);

		System.out.println(name);
		String name2 = "testleaf";
		// to count the number of character
		// System.out.println(name.length());
		int len = name.length();

		System.out.println(len);

		if (name.equalsIgnoreCase(name2)) {

			System.out.println("Both are same Value");
		}

		else {
			System.out.println("Both are not same");
		}

		String str = "TestLeaf is the best institute";

		String[] split = str.split(" ");

		// System.out.println(split);

		for (int i = 0; i < split.length; i++) {

			System.out.println(split[i]);
		}

		// String[]s= {"TestLeaf","is","the","best","institute"};
		// 0 1 2 3 4
	}

}
