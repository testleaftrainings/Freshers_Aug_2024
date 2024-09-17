package week2.day2;

public class SwappingNumberWithTemp {

	public static void main(String[] args) {

		int a = 10;

		int b = 20;

		int tmp;

		// op a=20 b=10

		System.out.println("Before Swapping the value of a = " + a);
		System.out.println("Before Swapping the value of b = " + b);

		tmp = a;// tmp=10

		a = b;// a=20

		b = tmp; // b=20
		System.out.println("************************************");

		System.out.println("After Swapping the value of a = " + a);
		System.out.println("After Swapping the value of b = " + b);

	}

}
