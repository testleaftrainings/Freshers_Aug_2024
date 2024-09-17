package week2.day3;

public class Variable {
	String name = "Gobi";

	static String str = "name";

	public void methods() {
		String name1 = "Yeswanth";

		System.out.println(name);
	}

	public void method1() {

		System.out.println(name);
	}

	public static void main(String[] args) {

		Variable obj = new Variable();
		System.out.println(Variable.str);
		System.out.println(obj.name);
		obj.methods();
	}

	// variable is a containtainer to store the data

	// String name="Gobi";

}
