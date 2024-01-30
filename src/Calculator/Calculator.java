package Calculator;

import java.util.Scanner;

public class Calculator {

	private static final int leftHandNumber = 0;
	private static final int rightHandNumber = 1;
	private static final int operator = 2;
	

	public static void main(String[] args) {

		Calculator calculato = new Calculator();


		try {
			calculato.loop();
		} catch (Throwable throwable) {
			System.out.println("an error occurrd: " + throwable.getMessage());

			throwable.printStackTrace();
		}


	}

	private void loop() {


		Scanner scanner = new Scanner(System.in);
		String message = "";

		int mode = leftHandNumber;
		double LeftHandNumber = 0, RightHandNumber = 0;

		while (!message.equals("exit")) {

			if (mode > operator) {
				mode = 0;
			}


			if (mode == leftHandNumber) {
				System.out.println("Please type the first number.");
			} else if (mode == rightHandNumber) {
				System.out.println("Please type the second number.");
			} else {
				System.out.println("Please type the operator +, -, /, *, %");
			}

			message = scanner.nextLine();


			if (mode == leftHandNumber) {
				LeftHandNumber = Double.parseDouble(message);
			} else if (mode == rightHandNumber) {
				RightHandNumber = Double.parseDouble(message);
			} else {

				if ("+".equals(message)) {
					System.out.println(LeftHandNumber + " + " + RightHandNumber + " = "
							+ (LeftHandNumber + RightHandNumber));
				} else if ("-".equals(message))
					System.out.println(LeftHandNumber + " - " + RightHandNumber + " = "
							+ (LeftHandNumber - RightHandNumber));
				else if ("/".equals(message))
					System.out.println(LeftHandNumber + " / " + RightHandNumber + " = "
							+ (LeftHandNumber / RightHandNumber));
				else if ("*".equals(message))
					System.out.println(LeftHandNumber + " * " + RightHandNumber + " = "
							+ (LeftHandNumber * RightHandNumber));
				else if ("%".equals(message))
					System.out.println(LeftHandNumber + " % " + RightHandNumber + " = "
							+ (LeftHandNumber % RightHandNumber));
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