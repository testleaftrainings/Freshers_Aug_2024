package week3.day1;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int num[] = { 1, 2, 7, 3, 6, 5, 8, 9 };

		// to order the values

		// 1 2 3 5 6 7 8 9

		Arrays.sort(num);

		// 1 2 3 5 6 7 8 9
//num[]	// 0 1 2 3 4 5 6 7
		//
		for (int i = 0; i < num.length; i++) {

			if (i + 1 != num[i]) {
				// 0+1= 1 ! num[0] =1
				// 1+1= 2 ! num[1] =2
				// 2+1= 3 ! num[2] =3
				// 3+1= 4 ! num[3] =5

				System.out.println(i + 1);
				break;

			}

		}

	}

}
