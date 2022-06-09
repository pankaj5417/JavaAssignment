package com.masai.mobilephone;

public class Contact {
	private String name;
	private String phoneNumber;
	
	Contact(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
//	public static String createContact(String name,String phoneNumber) {
//		
//	}
	
	public String toString() {
		return name+" "+phoneNumber;
	}

}
