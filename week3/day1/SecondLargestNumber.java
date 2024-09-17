package week3.day1;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int num[] = { 20, 44, 55, 77, 88, 221, 6556, 879, 76786987 };

		// 20 44 55 77 88 221 879 6556

		Arrays.sort(num);

		int length = num.length;

		System.out.println("SecondLargestNumber is: " + num[length - 2]);

	}
}
