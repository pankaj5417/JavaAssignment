package com.masai.mobilephone;

public class MobilePhoneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact phone1=new Contact("Rahul","8745699645");
		Contact phone2=new Contact("Shyam","9265234556");

		Contact phone3=new Contact("Sahil","9165564512");
		MobilePhone mobile=new MobilePhone("7815456545", phone1,phone2);
		System.out.println(mobile.addNewContact(phone3));
            mobile.updateContact(phone2, phone3);
           mobile.removeContact(phone3);
//            mobile.findContact(phone3);
//            mobile.findContact("Rahul");
//            mobile.queryContact(phone3);
          mobile.printContact();
          
            

	}

}
