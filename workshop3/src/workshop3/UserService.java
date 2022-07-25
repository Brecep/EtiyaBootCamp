package workshop3;

import java.util.List;

public interface UserService {
	void register(User user);
	void forgatPassword(User user);
	List<User> getAll();
}
