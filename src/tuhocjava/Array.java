package tuhocjava;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What's the length of array? ");
		int n = scanner.nextInt();

		int[] a = new int[n];
		System.out.println("Input array");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = scanner.nextInt();
		}

		System.out.print("This is your array: " + Arrays.toString(a) + "\n");

		// sort array
		Arrays.sort(a);

		System.out.print("This is the sorted array: " + Arrays.toString(a) + "\n");

		scanner.close();
	}
}
