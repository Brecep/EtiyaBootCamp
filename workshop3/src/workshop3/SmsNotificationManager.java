package workshop3;

public class SmsNotificationManager implements NotifacitionService {

	@Override
	public void send(User user) {
		System.out.println(user.getPhoneNumber() + " :Sms'e gönderildi!");

	}

}
