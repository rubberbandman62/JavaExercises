package utils;

import java.util.Scanner;

public class InputOutUtilities {
	
	public static String prompt(Scanner scanner, String text) {
		String result = "";
		while (result.isEmpty()) {
			System.out.print(text);
			result = scanner.nextLine();
			if (result.isEmpty())
				System.out.println("You must enter a String!");
		}
		return result;
	}

	
}
