package inputProcessingAndOutput.exercise1;

import static utils.InputOutUtilities.*;

import java.util.Scanner;

public class SayingHello {
	private static Scanner scanner;

	public void run() {
		System.out.println(reaction(prompt(scanner, "What's your name? ")));
	}

	private String reaction(String name) {
		switch (name) {
		case "Willi":
			return "Hello " + name + ", long time ago since we  last met.";
		case "Lara":
			return "Hello " + name + ", my lovely.";
		default:
			return "Hello " + name + ", nice to meet you!";
		}
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		new SayingHello().run();

		scanner.close();
	}

}
