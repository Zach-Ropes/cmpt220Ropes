/**
   * file: LocationTest.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 6, problem 9.13
   * March 20, 2017
   * version: 1.0
   * 
   * Runs the program Location.java
   */  
   
import Ropes.Location;
import java.util.Scanner;

   
public class LocationTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and columns of the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();
    double[][] array = new double[rows][columns];
    
    System.out.println("Enter the array: ");
    for (int r = 0; r < rows; r++)
      for (int c = 0; c < columns; c++)
        array[r][c] = input.nextDouble();
    
    Location locate = Location.locateLargest(array);
    
    System.out.print("The location of the largest element is " + locate.maxValue + " at (" + 
      locate.row + ", " + locate.column + ")");     
  }
}