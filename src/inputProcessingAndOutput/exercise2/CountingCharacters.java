package inputProcessingAndOutput.exercise2;

import static utils.InputOutUtilities.*;

public class CountingCharacters {

	public static void main(String[] args) {
		new CountingCharacters().run();
	}

	private void run() {
		String input = prompt("What is the input string? ");
		System.out.println(input + " has " + input.length() + " characters!");
	}
	

}
