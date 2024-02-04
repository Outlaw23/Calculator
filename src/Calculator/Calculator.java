package Calculator;

import java.util.Scanner;

public class Calculator {

	private static final int LeftHandNumber = 0;
	private static final int rightHandNumber = 1;
	private static final int operator = 2;

	int mode = LeftHandNumber;
	double[] numbers = {0, 0};
	String message = "";


	public static void main(String[] args) {

		Calculator calculato = new Calculator();

		try {
			calculato.loop();
		} catch (Throwable throwable) {
			System.out.println("an error occurrd: " + throwable.getMessage());

			throwable.printStackTrace();
		}
	}

	public void plusOperator() {

		System.out.println(numbers[0] + " + " + numbers[1] + " = "
				+ (numbers[0] + numbers[1]));
	}

	public void minusOperator() {
		System.out.println(numbers[0] + " - " + numbers[1] + " = "
				+ (numbers[0] - numbers[1]));
	}

	public void divideOperator() {
		System.out.println(numbers[0] + " / " + numbers[1] + " = "
				+ (numbers[0] / numbers[1]));
	}

	public void duplicateOperator() {
		System.out.println(numbers[0] + " * " + numbers[1] + " = "
				+ (numbers[0] * numbers[1]));
	}

	public void percentageOperator() {
		System.out.println(numbers[0] + " % " + numbers[1] + " = "
				+ (numbers[0] % numbers[1]));
	}


	private void loop() {

		Scanner scanner = new Scanner(System.in);

		while (!message.equals("exit")) {

			if (mode > operator) {
				mode = 0;
			}


			if (mode == numbers[0]) {
				System.out.println("Please type the first number.");
			} else if (mode == numbers[1]) {
				System.out.println("Please type the second number.");
			} else {
				System.out.println("Please type the operator +, -, /, *, %");
			}


			message = scanner.nextLine();

			if (mode == numbers[0]) {
				try {
					numbers[0] = Double.parseDouble(message);
				} catch (NumberFormatException numberFormatException) {
					System.out.println("invald operator: " + message);
					continue;
				}
			} else if (mode == numbers[1]) {
				try {
					numbers[1] = Double.parseDouble(message);
				} catch (NumberFormatException numberFormatException) {
					System.out.println("invald operator: " + message);
					continue;
				}
			} else {
				if ("+".equals(message)) {
					plusOperator();
				} else if ("-".equals(message))
					minusOperator();
				else if ("/".equals(message))
					divideOperator();
				else if ("*".equals(message))
					duplicateOperator();
				else if ("%".equals(message))
					percentageOperator();
				else {
					System.out.println("invald operator: " + message);
					continue;
				}
			}
			mode++;
		}
		System.out.println("You exit the program");
	}
}