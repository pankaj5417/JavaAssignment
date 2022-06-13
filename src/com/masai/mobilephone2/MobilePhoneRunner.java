package com.masai.mobilephone2;

public class MobilePhoneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameArr[]= {"Rahul","shyam","Geeta"};
		String contact[]= {"9898855845","8745454565","8512234565"};
		MobilePhone mobile=new MobilePhone(nameArr,contact);
		System.out.println(mobile.addNewContact("Safak","8578454512"));
		System.out.println(mobile.removeContact("Rahul"));
           
//            mobile.findContact("Rahul");
          mobile.printContact();
          
            

	}

}
