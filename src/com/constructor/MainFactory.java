package com.constructor;

public class MainFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory type=new ShapeFactory();
		
		Shape shape=type.getShape("circle");
		shape.draw();
		
		
		
	}

}
