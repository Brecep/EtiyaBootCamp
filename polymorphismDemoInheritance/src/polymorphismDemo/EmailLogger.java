package polymorphismDemo;

public class EmailLogger extends BaseLogger{
	@Override
	public void Log(String messsage) {
		System.out.println("Email message : " + messsage);
	}
}
