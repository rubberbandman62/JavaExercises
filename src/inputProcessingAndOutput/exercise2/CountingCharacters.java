package inputProcessingAndOutput.exercise2;

import static utils.InputOutUtilities.*;

import java.util.Scanner;

public class CountingCharacters {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		new CountingCharacters().run();
		scanner.close();
	}

	private void run() {
		String input = prompt(scanner, "What is the input string? ");
		System.out.println(input + " has " + input.length() + " characters!");
	}
	

}
