package utils;

import java.util.Scanner;

public class InputOutUtilities {
	public static String prompt(String text) {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		while (result.isEmpty()) {
			System.out.print(text);
			result = scanner.nextLine();
			if (result.isEmpty())
				System.out.println("You must enter a String!");
		}
		scanner.close();
		return result;
	}
}
