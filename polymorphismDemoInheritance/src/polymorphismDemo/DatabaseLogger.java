package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	@Override
	public void Log(String messsage) {
		System.out.println("Database message : " + messsage);
	}
}
