package week2.day4;

public class ReturnType {

	public String cashWithDrawal() {

		// int amount = 12000;
		String name = "vinoth";
		System.out.println(name);

		return name;
	}

	public void deposit() {

		int cash = 500;

		System.out.println(cash);
	}

	public static void main(String[] args) {
		ReturnType obj = new ReturnType();

		String abc = obj.cashWithDrawal();

		abc = "Sanjay";
		System.out.println(abc);

		abc = "Vetri";
		System.out.println(abc);

		abc = "tutyui";
		System.out.println(abc);

		// String cashWithDrawal = obj.cashWithDrawal();

		// System.out.println(var);

		obj.deposit();

	}
}
