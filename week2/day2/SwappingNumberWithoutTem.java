package week2.day2;

public class SwappingNumberWithoutTem {

	public static void main(String[] args) {

		int a = 10;

		int b = 20;

		System.out.println("Before Swapping the value of a = " + a);
		System.out.println("Before Swapping the value of b = " + b);

		b = b - a;

		// b=20-10=10

		a = a + b;

		// a=10+10

		System.out.println("************************************");

		System.out.println("After Swapping the value of a = " + a);
		System.out.println("After Swapping the value of b = " + b);

	}

}
