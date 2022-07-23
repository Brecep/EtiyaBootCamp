package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgrenciKrediManager(),
				new OgretmenKrediManager(), new TarimKrediManager() };

		for (BaseKrediManager baseKrediManager : krediManagers) {
			System.out.println(baseKrediManager.hesapla(1000));
		}
	}

}
