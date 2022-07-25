package workshop3;

public class EmailNotifacitonManager implements NotifacitionService{

	@Override
	public void send(User user) {
		System.out.println(user.getEmail()+" :Email'e gönderildi!" );
		
	}

}
