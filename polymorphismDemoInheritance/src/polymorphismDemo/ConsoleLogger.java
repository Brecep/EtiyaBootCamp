package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	@Override
	public void Log(String messsage) {
		System.out.println("Console message : " + messsage);
	}
}
