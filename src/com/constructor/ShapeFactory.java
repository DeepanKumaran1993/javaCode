package com.constructor;

public class ShapeFactory {

	public Shape getShape(String shape) {
	
		if(shape.toLowerCase().equals("circle")) {
			return new Circle();
		}
		else if(shape.toLowerCase().equals("square")) {
			return new Square();
		}
	
		
		return null;
	}
	
}
