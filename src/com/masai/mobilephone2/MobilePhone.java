package com.masai.mobilephone2;
import java.util.ArrayList;
public class MobilePhone {
	
	private ArrayList<String>contact=new ArrayList<String>();
	
	private ArrayList<String> name=new ArrayList<String>();

	
public MobilePhone(String names[], String contacts[]) {
		super();
       for(String myname:names) {
			
			this.name.add(myname);
		}		
       for(String myContact:contacts) {
			
			this.contact.add(myContact);
		}
	}


public boolean addNewContact(String myname,String myContact) {
		if(name.contains(myname)) {
			return false;
		}
	name.add(myname);
	contact.add(myContact);
		return true;
	}
	

public boolean removeContact(String rname) {
	if(name.contains(rname)) {
		int index=name.indexOf(rname);
		name.remove(rname);
		contact.remove(index);

		return true;
	}
	return false;
}

public int findContact(String sname) {
	for(String myname:name) {
		
		if(myname==sname) {
			int index=name.indexOf(myname);
			return index;
		}
	}
	return -1;
}


public void printContact() {
	for(int i=0;i<contact.size() && i<name.size();i++) {
		System.out.println(i+"."+" "+name.get(i)+" "+"->"+" "+contact.get(i));
		
	}
}

}
