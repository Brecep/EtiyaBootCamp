package oop2;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println(data+ " File loglandı");	
	}

}
