import java.util.Scanner;


public class Calculator
{

    public int subtract(int first, int second) {
        return first - second;
    }

    public int add(int first, int second) {
        return first + second;
    }

    public void test() {
        System.out.println("test");
    }
    
}

	public static void main(String[] args) {
	    int answer=0;
	    int error= 0;
		Scanner scanner = new Scanner(System.in);
		for( ; ;)
		{
		error =0;	
		System.out.println("Enter the first number:");
		int firstnumber = scanner.nextInt(); 
		System.out.println("Enter the application: + - * / ^");
		String application = scanner.next();
		System.out.println("Enter the second number");
		int secondnumber = scanner.nextInt();
	
		if (application.equals("+"))
		answer = Calculator.add(firstnumber, secondnumber);
		else if (application.equals("-"))
		answer = Calculator.subtract(firstnumber, secondnumber);
		else if (application.equals("*"))
		answer = Calculator.mult(firstnumber, secondnumber);
		else if (application.equals("/"))
		answer = Calculator.division(firstnumber, secondnumber);
		else if (application.equals("^"))
		answer = Calculator.power(firstnumber, secondnumber);
		else 
		{System.out.println("The application is incorrect please try again");
		error = 1;}
		if (error == 0)
			System.out.println("The answer is " + answer);
	
		}
	}