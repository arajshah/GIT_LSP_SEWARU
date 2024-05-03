package org.howard.edu.lsp.oopfinal.question3;

//ShapeFactory.java
public class ShapeFactory {
	 // Factory method to create circles
	 public static Shape createCircle() {
	     return new Circle();
	 }
	
	 // Factory method to create rectangles
	 public static Shape createRectangle() {
	     return new Rectangle();
	 }
}
