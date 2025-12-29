package com.dsgn;

abstract class UserData{
	public abstract void display();
}

class OriginalData extends UserData{
	
	String username;
	String pwd;
	
//	String userData  = username+" "+pwd;
	
	public OriginalData(String user,String pass) {
		this.username = user;
		this.pwd = pass;
	}

	@Override
	public void display() {
		System.out.println("Original UserData :"+username +" "+ pwd);
	}
	
}

class ProxyData extends UserData{

	private String username;
	private String pwd;
	
	private String userData = username +" "+ pwd;
	
	private OriginalData oData = null;
	
	public ProxyData(String username,String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	
	@Override
	public void display() {
		if(oData == null) {
			oData = new OriginalData(username, pwd);
		}
		oData.display();
	}
	
}

public class ProxyDemo {

	public static void main(String[] args) {
		UserData obj1 = new OriginalData("Abishek", "pass");
		
		obj1.display();
		
		UserData obj2 = new ProxyData("Sahana", "Pass");
		
		obj2.display();
	}

}
