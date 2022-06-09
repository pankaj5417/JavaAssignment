package com.masai.reactangle;

public class RectangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(13,32);
		System.out.println(rectangle);
		rectangle.setWidth(25);
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		
		System.out.println(rectangle);

	}

}
