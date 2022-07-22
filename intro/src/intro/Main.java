package intro;

public class Main {

	public static void main(String[] args) {
		asalList(1000);
	}

	static void asalList(int sayi) {
		for (int i = 2; i <= sayi; i++) {
			if (checkAsal(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean checkAsal(int sayi) {
		boolean control = true;
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				control = false;
			}
		}
		return control;
	}

}
