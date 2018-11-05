import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CountdownGame2 {
	static Random generate = new Random();
	static Scanner tastatur = new Scanner(System.in);

	// random number between 100-999
	public static void threeDigitNumber() {
		int threeDigit = generate.nextInt(900) + 100;
		System.out.println("\n" + threeDigit);
	}

	// Here you can choose between 1-3 big numbers and the rest will be small, total
	// of 6 numbers
	public static void countdownNumber() {
		int big;
		ArrayList<Integer> smallNum = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			smallNum.add(i);
			smallNum.add(i);
		}

		ArrayList<Integer> bigNum = new ArrayList<Integer>();
		bigNum.addAll(Arrays.asList(100, 75, 50, 25));
		
		ArrayList<Integer> yourNum = new ArrayList<Integer>();

		System.out.print("How many big numbers do you want? (1-3):");
		big = tastatur.nextInt();
		System.out.println("You got " + big + " big numbers and " + (6 - big) + " little ones.\n");

		// should be a better way wit not as much code

		for (int i = 0; i < big; i++) {
			int genNum = generate.nextInt(bigNum.size());
			yourNum.add(bigNum.get(genNum));
			bigNum.remove(genNum);
		}
		for (int i = 0; i < 6 - big; i++) {
			int genNum = generate.nextInt(smallNum.size());
			yourNum.add(smallNum.get(genNum));
			smallNum.remove(genNum);
		}
		System.out.println();
		System.out.println(yourNum);

	}

	// here is an array of 9 letters either vowel or consonant
	// least three vowels and four consonants (not implemented)
	public static void nineLetters() {
		String[] vowel = { "a", "e", "i", "o", "u", "y", "w" };
		String[] consonant = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x",
				"z" };
		List<String> list = new ArrayList<>();
		char velg, v = 0, c = 0;
		for (int i = 0; i < 9; i++) {
			System.out.print("Do you want a vowel or a consonant? (v/c):");
			velg = tastatur.next().charAt(0);
			if (velg == 'v') {
				String a = vowel[generate.nextInt(10)];
				list.add(a);
				System.out.println(list);
			} else if (velg == 'c') {
				String a = consonant[generate.nextInt(19)];
				list.add(a);
				System.out.println(list);
			} else {
				System.out.println("Ugyldig data");
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Do you want to play with numbers or letters? (n/l): ");
		String svar = tastatur.nextLine();

		if (svar.equals("n")) {
			System.out.println("numbers");
			countdownNumber();
			threeDigitNumber();
		} else if (svar.equals("l")) {
			System.out.println("letters");
			nineLetters();
		} else {
			System.out.println("buuuuuuuuuuuuuuuuuuuu");
		}
	}

}