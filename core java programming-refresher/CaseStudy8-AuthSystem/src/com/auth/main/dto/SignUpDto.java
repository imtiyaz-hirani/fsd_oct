package com.auth.main.dto;

public class SignUpDto {
	private String name;
	private String email;
	private String jobTitle;
	private String hasEmployeeId;
	private String username;
	private String password;
	private String repassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getHasEmployeeId() {
		return hasEmployeeId;
	}

	public void setHasEmployeeId(String hasEmployeeId) {
		this.hasEmployeeId = hasEmployeeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	@Override
	public String toString() {
		return "SignUpDto [name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", hasEmployeeId="
				+ hasEmployeeId + ", username=" + username + ", password=" + password + ", repassword=" + repassword
				+ "]";
	}

}
