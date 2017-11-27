package automate.logic;

public enum LoginEnum {

	USER("Factor_m", "Marta^21^15");

	private String login;
	private String password;

	LoginEnum(String login, String password) {
		setLogin(login);
		setPassword(password);
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

}
