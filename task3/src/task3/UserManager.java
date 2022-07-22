package task3;

public class UserManager {

	public void add(User user) {
		System.out.println("User eklendi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void delete(User user) {
		System.out.println("User silindi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void update(User user) {
		System.out.println("User güncellendi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}

	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}
	}
}
