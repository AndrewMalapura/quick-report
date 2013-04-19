package opo.vistec.auth.model;


public class User{

	 private Long userId;
	 private String login;
	 private String userName;
	 private String password;

	public Long getUserId(){
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public boolean equals(User usr) {
	    if(usr.getLogin().equals(login))
	    	if(usr.getPassword().equals(password))
	    		return true;
	    return false;
	}
}
