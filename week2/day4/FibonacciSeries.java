package week2.day4;

public class FibonacciSeries {

	// 1 2 3 4 5 6 7 8 9

	// 0 +1= 1
	// 1 + 1= 2
	// 1 + 2 =3
	// 2+ 3 =5

	// 1st 0 1 1 2 3

	// 2nd 1 1 2 3 5

	// 3rd 1 2 3 5 8

	public static void main(String[] args) {

		int firtNumber = 0;

		int secondNumber = 1;

		int thirdNumber;

		for (int i = 0; i < 10; i++) {
			thirdNumber = firtNumber + secondNumber;
			// thirdNumber= 0 + 1 ==1
			// 3rd= 1+1==2
			// srd= 1+2 =3
			System.out.println(thirdNumber);
			firtNumber = secondNumber;
			// firstNumber= 1
			// 1
			// 2
			secondNumber = thirdNumber;
			// secondNumber =1
			// 2
			// 3

		}

	}
}
