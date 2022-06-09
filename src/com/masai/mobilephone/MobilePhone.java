package com.masai.mobilephone;
import java.util.ArrayList;
public class MobilePhone {
	private String mynumber;
	private ArrayList<Contact> myContacts=new ArrayList<>();
	
	
	
public MobilePhone(String mynumber, Contact... myContacts) {
		super();
		this.mynumber = mynumber;
		for(Contact myContact:myContacts) {
			
			this.myContacts.add(myContact);
		}
	}


public boolean addNewContact(Contact contact) {
		if(myContacts.contains(contact)) {
			return false;
		}
		myContacts.add(contact);
		return true;
	}
	
public boolean updateContact(Contact oldContact,Contact newContact) {
	if(!myContacts.contains(oldContact)) {
		return false;
	}
	int index=myContacts.indexOf(oldContact);
	System.out.println(index);
	myContacts.set(index, newContact);
	return true;
}
public boolean removeContact(Contact contact) {
	if(myContacts.contains(contact)) {
		myContacts.remove(contact);
		return true;
	}
	return false;
}
//public int findContact(Contact contact) {
//	for(Contact myContact:myContacts) {
//		
//		if(myContact==contact) {
//			int index=myContacts.indexOf(myContact);
//			return index;
//		}
//		return -1;
//	}
//}
//
//public int findContact(String name) {
//	for(Contact myContact:myContacts) {
//		
//		if(myContact.getName()==name) {
//			int index=myContacts.indexOf(myContact);
//			return index;
//		}
//		return -1;
//	}
//}
//public Contact queryContact(String name) {
//for(Contact myContact:myContacts) {
//		
//		if(myContact.getName()==name) {
//			return myContact;
//		}
//		return null;
//	}
//}

public void printContact() {
	for(int i=0;i<myContacts.size();i++) {
		System.out.println(i+"."+" "+myContacts.get(i).getName()+" "+"->"+" "+myContacts.get(i).getPhoneNumber());
		
	}
}

}
