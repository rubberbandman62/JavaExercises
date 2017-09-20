package inputProcessingAndOutput.exercise1;

import java.util.Scanner;

public class SayingHello {

	public void run() {
		System.out.println(reaction(prompt("What's your name? ")));
	}

	private String prompt(String text) {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		while (result.isEmpty()) {
			System.out.print(text);
			result = scanner.nextLine();
		}
		scanner.close();
		return result;
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
		new SayingHello().run();
	}

}
