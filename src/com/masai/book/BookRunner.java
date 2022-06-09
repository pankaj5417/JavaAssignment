package com.masai.book;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Book book = new Book(123, "OOP in JAVA", "Shubham");
		
		book.addReview(10,"Great Book",5);
		book.addReview(11,"Awesome",5);
		
		System.out.println(book);
	}

}
