package week3.day1;

import week3.day2.LaunchBrowser;

public class LearnArrays extends LaunchBrowser {

	public static void main(String[] args) {

//		int a=10;
//		
//		a=20;
//		
//		a=30;
//		
		int i;

		// Array Literal

		int num[] = { 10, 20, 30, 40, 50, 677, 877, 886, 333 };
		// index 0 1 2 3 4 5 6 7 8

		for (i = 0; i < num.length; i++) {

			// i=0 9
			System.out.println(num[i]);
		}

	}

}
