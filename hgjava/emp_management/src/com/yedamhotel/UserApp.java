package com.yedamhotel;


class User{
	String id;
	String pw;
	String name;
	
	public User(String id, String pw, String name) {
		this.id = id;
		this.pw =pw;
		this.name =name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class UserApp {
	 User[] users;
	 
	 public UserApp() {
		 users = new User[1];
		 users[0] = new User("관리자","관리자","관리자");
	 }
	 
	 public User login(String id, String pw) {
			for(int i = 0; i<users.length;i++) {
				if(users[i] != null) {
					if(users[i].getId().equals(id) && users[i].getPw().equals(pw)) {
						return users[i];
					}
				}
			}
			return null;
		}
 
}
