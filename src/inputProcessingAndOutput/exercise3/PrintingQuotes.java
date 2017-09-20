package inputProcessingAndOutput.exercise3;

import static utils.InputOutUtilities.*;

import java.util.Scanner;

public class PrintingQuotes {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		String quote = prompt(scanner, "What is the quote? ");
		String source = prompt(scanner, "Who said it? ");
		System.out.println(source + " said \"" + quote + "\"");
		
		scanner.close();
	}

}
