package inputProcessingAndOutput.exercise2;

import java.util.Scanner;

public class CountingCharacters {

	public static void main(String[] args) {
		new CountingCharacters().run();
	}

	private void run() {
		String input = prompt("What is the input string? ");
		System.out.println(input + " has " + input.length() + " characters!");
	}
	
	private String prompt(String text) {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		while (result.isEmpty()) {
			System.out.print(text);
			result = scanner.nextLine();
			if (result.isEmpty()) System.out.println("You must enter a String!");
		}
		scanner.close();
		return result;
	}

}
