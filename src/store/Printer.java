package store;

import java.util.Scanner;

public class Printer {
	Scanner scanner;

	public Printer() {
		scanner = new Scanner(System.in);
	}

	void close() {
		scanner.close();
	}

	int getLocation() {
		System.out.println(
				"Welcome to Artin's Car Rental, please choose your location: \n 1: Bergen \n 2: Tromsø \n 3: Stavanger");
		int result = scanner.nextInt();
		return result;
	}

	void printOffice(Office office) {
		String message = String.format("You have chosen %s. These are the available cars at the moment: \n%s",
				office.officeName, office.toString());
		System.out.print(message);
	}

	void printError() {
		System.out.println("Error. Try again 😤");
	}
}