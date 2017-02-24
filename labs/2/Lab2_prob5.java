/**
   * file: Lab2_prob5.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 4.1
   * due date: February 9, 2017
   * version: 1.1
   * 
   * Finds the area of a penatagon
   */

import java.util.Scanner;

public class Lab2_prob5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the length from the center to the vertex: ");
    double r = input.nextDouble();
    double s = 2 * r * Math.sin(Math.PI / 5);
    double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
    double round = Math.round(area * 100) / 100.00;

    System.out.println("The area of the pentagon is " + round);
  }
}
