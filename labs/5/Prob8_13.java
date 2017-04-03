/**
   * file: Prob8_13.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 5, problem 8.13
   * April 3, 2017
   * version: 1.0
   * 
   * Finds the location of the largest element in a multi dimensional array
   */  
import java.util.Scanner;
   
public class Prob8_13 {
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
    
    int[] locate = locateLargest(array);
    
    System.out.print("The location of the largest element is at (" + 
      locate[0] + ", " + locate[1] + ")");     
  }
  public static int[] locateLargest(double[][] a) {
    double largest = a[0][0];
    int[] location = new int[2];
    
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (largest < a[i][j])
          location[0] = i - 1;
          location[1] = j - 1;
          largest = a[i][j];
      }
    }
    return location;
  }
}