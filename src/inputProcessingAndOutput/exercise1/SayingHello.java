package inputProcessingAndOutput.exercise1;

import java.util.Scanner;

public class SayingHello {
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, " +
				prompt(scanner, "What's your name? ") +
				", nice to meet you!");
		scanner.close();
	}
	
	private String prompt(Scanner scanner, String text) {
		System.out.print(text);
		return scanner.nextLine();
	}

	public static void main(String[] args) {
		new SayingHello().run();
	}

}
