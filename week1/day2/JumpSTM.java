package week1.Day2;

public class JumpSTM {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {

				continue;// it will skips the current iteration and continue

			}

			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				break; // it terminates the loop immediately
			}
			System.out.println(i);
		}

	}

}
