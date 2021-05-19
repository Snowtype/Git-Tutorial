import java.util.Scanner;

public class my_module {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {


		System.out.println("This is my_module.java");

		System.out.println("Please type");
		int a = 0;
		a = sc.nextInt();
		int b = 0;
		b = sc.nextInt();



		int c = add(a, b);
		System.out.println(c);

		

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}
}