package polymorphismDemo;

public class FileLogger extends BaseLogger{
	@Override
	public void Log(String messsage) {
		System.out.println("File message : " + messsage);
	}
}
