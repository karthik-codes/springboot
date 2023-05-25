package com.example.FactoryPattern;


//create a object of a interface and refer its method.
public class ShapeFactory {
	
	public Shape getShape(String shapeName) {
		if(shapeName==null) {
			return null;
		}
		 if(shapeName.equalsIgnoreCase("CIRCLE")) {
			return  new Circle();
			
		}
		else if(shapeName.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
	public static void main(String[] args) {
		ShapeFactory sFactory=new ShapeFactory();
		////get an object of Circle and call its draw method.
		Shape shape1=sFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2=sFactory.getShape("RECTANGLE");
		shape2.draw();
	}

}
