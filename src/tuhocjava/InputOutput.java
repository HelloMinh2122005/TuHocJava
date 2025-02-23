package tuhocjava;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		// use Scanner to input
		Scanner scanner = new Scanner(System.in);

		System.out.print("What's your name? ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		System.out.println("You are " + age + " years old");

		scanner.close();
	}
}
