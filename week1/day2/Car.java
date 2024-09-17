package week1.Day2;

import week2Day3.ClassA;

public class Car {

	int a = 10;

	public void applyingBreak() {

		System.out.println("Break has been  applied");
	}

	public void soundHorn() {

		System.out.println("Sound Horn");
	}

	public static void main(String[] args) {

		// syntax for creating object

		// ClassName objectName= new ClassName();

		Car obj = new Car();
		obj.applyingBreak();

		obj.soundHorn();

		ClassA object = new ClassA();
		

		// single line comment

		/*
		 * multiline comment
		 * 
		 */

	}

}
