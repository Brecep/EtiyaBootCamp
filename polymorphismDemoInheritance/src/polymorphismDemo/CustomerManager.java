package polymorphismDemo;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}

	public void add() {
		this.baseLogger.Log("Musteri eklendi");
	}
}
