package workshop3;

public class Main {

	public static void main(String[] args) {
		User recep = new User(1, "Recep", "Bayindir", "recep@gmail.com", "12345", "53333333333",
				new EmailNotifacitonManager());
		User recep1 = new User(1, "Recep", "Bayindir", "recep@gmail.com", "12345", "53333333333",
				new SmsNotificationManager());
		UserManager manager = new UserManager();
		manager.register(recep);
		manager.forgatPassword(recep);
		manager.register(recep1);
		manager.forgatPassword(recep1);
		
	}

}
