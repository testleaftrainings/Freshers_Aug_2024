package week5.day1;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String input = "TestLeaf";
		int tmp = 0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				//T=='e' 
				// e==e tmp=2
				// s==e
				// t==e
				// L==e
				// e==e
				// a==e
				// f==e

				tmp++;

			}
		}

		System.out.println("The occurance of e count is : " + tmp);

	}
}
