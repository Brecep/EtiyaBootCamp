package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidsGameCalculator calculator = new KidsGameCalculator();
		calculator.hesapla();

		GameCalculator gameCalculator = new ManGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
	}

}
