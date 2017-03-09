/**
   * file: Prob7_9.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 7.9
   * March 8, 2017
   * version: 1.0
   * 
   * Finds the minimum number in an array of ten values 
   */  
   
import java.util.Scanner;
   
public class Prob7_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double[] array = new double[10];
    
    System.out.print("Enter ten numbers: ");
    
    for (int k = 0; k < array.length; k++)
      array[k] = input.nextDouble();
    
    System.out.println("The minimum number is " + min(array));
  }
  public static double min(double[] array) {
    double min = array[0];
    for (int l = 0; l < array.length; l++)
      if (min > array[l])
        min = array[l];
    return min;
  }
}