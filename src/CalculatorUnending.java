import java.io.BufferedReader;
import java.util.Scanner;

public class CalculatorUnending {

	public static void main(String[] args) {

		Boolean flag = new Boolean(true);
		while (flag) {
			flag = askOptions();
		}
		
		System.out.println("exiting from programme.");

	}

	public static boolean askOptions() {

		System.out.println("Please press the button as per choice");
		System.out.println("Press 1 for sum:");
		System.out.println("Press 2 for sub:");
		System.out.println("Note: Any other button apart from 1 & 2 will close the program");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		// Case statements
		case 1: {
			System.out.println("Enter value for A:");
			int a = sc.nextInt();
			System.out.println("Enter value for B:");
			int b = sc.nextInt();
			System.out.println("Sum: " + (a + b));
			return true;
		}
		case 2: {
			System.out.println("Enter value for A:");
			int a = sc.nextInt();
			System.out.println("Enter value for B:");
			int b = sc.nextInt();
			System.out.println("Sub: " + (a - b));
			return true;
		}
		default:
			return false;

		}

	}

}
