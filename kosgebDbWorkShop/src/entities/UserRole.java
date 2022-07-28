package entities;

public class UserRole {
	private int userRoleId;
	private Role role;
	private User user;

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRole(int userRoleId, Role role, User user) {
		super();
		this.userRoleId = userRoleId;
		this.role = role;
		this.user = user;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
