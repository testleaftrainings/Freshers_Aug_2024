package week2.day2;

public class MultiplicationTables {

	public static void main(String[] args) {

		int num = 9;

		// 9 *1 =9
		// 9 *2 =18
		// 9 *3 =27

		for (int i = 0; i <= 10; i++) {

			int sum = num * i;

			System.out.println( num + " * " + i + "= " + sum);

		}

	}

}
