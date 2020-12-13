package Server;

import java.io.Serializable;

public class Message implements Serializable{
	
	private String message;
	
	private String user;

	Message(String message){
		setMessage(message);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	
}
