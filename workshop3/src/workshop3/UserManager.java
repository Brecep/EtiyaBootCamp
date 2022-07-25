package workshop3;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
	private List<User> users;

	public UserManager() {

		users = new ArrayList<>();
	}

	@Override
	public void register(User user) {
		users.add(user);
		NotifacitionService notifacitionService = user.getNotifacitionService();
		notifacitionService.send(user);
		System.out.println("Kullanici kaydedildi!");
	}

	@Override
	public void forgatPassword(User user) {
		user.setPassword("23232323");
		NotifacitionService notifacitionService = user.getNotifacitionService();
		notifacitionService.send(user);
		System.out.println("Sifre gonderildi");
	}

	@Override
	public List<User> getAll() {

		return users;
	}

}
