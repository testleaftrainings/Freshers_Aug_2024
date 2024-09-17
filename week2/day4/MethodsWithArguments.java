package week2.day4;

public class MethodsWithArguments {

	public void clearCache(String str, int a, float b, boolean c) {

		System.out.println(str);

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

	}

	public static void main(String[] args) {

		MethodsWithArguments obj = new MethodsWithArguments();
		obj.clearCache("Cleared", 10, 76.099f, true);

	}

}
