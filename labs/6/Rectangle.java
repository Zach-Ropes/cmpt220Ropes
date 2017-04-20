/**
   * file: Rectangle.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 6, problem 9.1
   * March 20, 2017
   * version: 1.0
   * 
   * Displays the width, height, area, and perimeter of each rectangle in this order
   */  
   
public class Rectangle {
  public static void main(String[] args) {
      
    Rectangle rectangle1 = new Rectangle(4, 40);
    System.out.println("The width, height, area, and perimeter of this rectangle is " +
      rectangle1.width + " " + rectangle1.height + " " + rectangle1.getArea() + 
      " "+ rectangle1.getPerimeter());
  
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    System.out.println("The width, height, area, and perimeter of this rectangle is " +
      rectangle2.width + " " + rectangle2.height + " " + rectangle2.getArea() + 
      " "+ rectangle2.getPerimeter());
  }

  
  double height;
  double width;
  
  
  Rectangle(double newWidth, double newHeight) {
    height = newHeight;
    width = newWidth;
  }
  
  /** Return the area of this rectangle */
  double getArea() {
    return Math.round(height * width * 100)/100;
  }
  
  /** Return the perimeter of this rectangle */
  double getPerimeter() {
    return (2 * height) + (2 * width);
  }
}