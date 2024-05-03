package org.howard.edu.lsp.oopfinal.question3;

//Client.java
public class Client {
 public static void main(String[] args) {
     Shape circle = ShapeFactory.createCircle();
     circle.draw();

     Shape rectangle = ShapeFactory.createRectangle();
     rectangle.draw();
 }
}