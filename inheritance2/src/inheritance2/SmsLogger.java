package inheritance2;

public class SmsLogger implements Logger {
	@Override
	public void log(String message) {
		System.out.println("Sms to log : " + message);
	}
}
