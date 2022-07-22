package task1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		reCapDemo2();
		miniProject2('E');
		perfectNumberList(100000);
		containsNumber();
	}

	public static void containsNumber() {
		int random = new Random().nextInt(50);
		int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean checkNumber = false;
		for (int i : numberArray) {
			if (i == random)
				checkNumber = true;
		}
		if (checkNumber)
			System.out.println("Bu sayiyi icerir : " + random);
		else
			System.out.println("Bu sayiyi icermez : " + random);
	}

	public static void perfectNumberList(int number) {
		for (int i = 1; i < number; i++) {
			if (perfectNumber(i))
				System.out.println(i + " => Mukemmel Sayidir");
		}
	}

	public static boolean perfectNumber(int number) {
		boolean control = false;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				total += i;
		}
		if (number == total)
			control = true;
		return control;
	}

	public static void miniProject2(char harf) {
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Harf");
			break;
		default:
			System.out.println("Ince Harf");
		}
	}

	public static void reCapDemo2() {
		double[] myList = { 1.2, 2.0, 1.8, 0.4, 0.41, 2.3, 1.9 };
		double total = 0;
		double max = myList[0];
		for (double d : myList) {
			if (d > max) {
				max = d;
			}
			total += d;
		}
		System.out.println("Toplam : " + total);
		System.out.println("En Buyuk Sayi : " + max);
	}
}
