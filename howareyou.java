import java.util.Scanner;

public class FibonacciMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int x = scanner.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print(fibonacci(i) + " ");
		scanner.close();
		}
				
	}
	public static int fibonacci(int x) {
		if (x == 0) {
			return 0;
		}else if (x == 1 || x == 2) {
			return 1;
		}else {
			return fibonacci (x-2) + fibonacci (x-1);
		}
	}

}

