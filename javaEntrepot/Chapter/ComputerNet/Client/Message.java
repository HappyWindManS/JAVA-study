package client;

import java.io.Serializable;
 
public class Message implements Serializable {
   
	private String message;
	private String user;
	
	Message(String message,String user)
	{
		this.setMessage(message);
		this.setUser(user);
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