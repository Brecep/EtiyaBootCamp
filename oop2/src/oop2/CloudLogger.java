package oop2;

public class CloudLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data + "cloud loglandı!");
	}

}