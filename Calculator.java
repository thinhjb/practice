import java.util.Scanner;

public class Calculator {
	public int subtract(int first, int second) {
		return 0;
	}

	public int add(int first, int second) {
		return 0;
	}

	public void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
	    int answer = 0;
	    int error = 0;
	    int first = 0;
	    int second = 0;
		Scanner scanner;
		scanner = new Scanner(System.in);

		while (true) {
			error = 0;
			System.out.println("Enter the first number:");
			first = scanner.nextInt();
			System.out.println("Enter the application: + - * / ^");
			String application = scanner.next();
			System.out.println("Enter the second number");
			second = scanner.nextInt();

			if (application.equals("+")) {
				answer = Calculator.add(first, second);
			} else if (application.equals("-")) {
				answer = Calculator.subtract(first, second);
			} else if (application.equals("*")) {
				answer = Calculator.mult(first, second);
			} else if (application.equals("/")) {
				answer = Calculator.division(first, second);
			} else if (application.equals("^")) {
				answer = Calculator.power(first, second);
			} else {
				System.out.println("The application is incorrect please try again");
				error = 1;
			}
			if (error == 0)
				System.out.println("The answer is " + answer);
		}
		
		switch (application) {
		case "*" : answer = first * second;
		case "/" : answer = first / second;
		}
		
	}

};
