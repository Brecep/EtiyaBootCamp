package inheritance2;

public class EmailLogger implements Logger{
	@Override
	public void log(String message) {
		System.out.println("Email to log : " + message);
	}
}
