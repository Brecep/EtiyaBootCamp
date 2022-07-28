package entities;

import java.util.List;

public class Role {
	private int roleId;
	private String roleDescription;
	private List<User> users;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int roleId, String roleDescription, List<User> users) {
		super();
		this.roleId = roleId;
		this.roleDescription = roleDescription;
		this.users = users;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
