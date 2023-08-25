package finalExam1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of 'n': ");
		int n = scanner.nextInt();

		if (n < 1 || n > 500) {
			System.out.println("Invalid input. 'n' should be between 1 and 500.");
			return;
		}

		int[] randomNumbers = generateRandomNumbers(500);
		int nthSmallest = findNthSmallest(randomNumbers, n);

		System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));
		System.out.println("The " + n + "th smallest number is: " + nthSmallest);
	}

	public static int[] generateRandomNumbers(int count) {
		int[] randomNumbers = new int[count];
		Random random = new Random();

		for (int i = 0; i < count; i++) {
			randomNumbers[i] = random.nextInt(500); // Change 500 to the desired range
		}

		return randomNumbers;
	}

	public static int findNthSmallest(int[] numbers, int n) {
		Arrays.sort(numbers);
		return numbers[n - 1];
	}
}
