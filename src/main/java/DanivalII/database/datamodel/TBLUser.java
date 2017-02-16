package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLUser implements Serializable {
	
	protected String id;
	protected String UserName = null;
	protected String Password = null;
	
	public TBLUser(){
		
	}
	
	public TBLUser(String id, String userName, String password) {
		super();
		this.id = id;
		this.UserName = userName;
		this.Password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId( String string) {
		this.id = string.toString();
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
		
	

}
