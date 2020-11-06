package com.training.org;

public class Role {
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Role [role=" + role + "]";
	}

	public Role() {
		super();
	}

	public Role(String role) {
		super();
		this.role = role;
	}

}
