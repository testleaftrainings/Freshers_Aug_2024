package week2.day2;

public class FactorialNumbers {

	// Factorial of 5 = 5*4 *3 *2 *1= 120

	public static void main(String[] args) {

		int num = 5;

		int fact = 1;

		for (int i = num; i >= 1; i--) {
			// fact =1
			// fact =5
			// fact =20
			// fact= 60
			// fact =120

			fact = i * fact;

			// 5 *1== 5
			// 4*5=20
			// 3*20=60
			// 2*60=120
			// 1 *120=120

			

		}
		System.out.println("The Facatrorial number of " + num + ":" + fact);

	}

}
