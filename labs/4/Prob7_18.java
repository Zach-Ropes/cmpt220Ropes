/**
   * file: Prob7_18.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 7.18
   * March 8, 2017
   * version: 1.0
   * 
   * Reads 10 numbers and displays them sorted out
   */  

import java.util.Scanner;
   
public class Prob7_18 {
  public static void main(String[] args) {
    double[] array = new double[10];
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ten double numbers: ");
    
    for (int k = 0; k < array.length; k++)
      array[k] = input.nextDouble();
    
    for (int r = 0; r < array.length; r++) {
      for (int s = 0; s < array.length - 1; s++){
        if (array[s] > array[s + 1])
          swap(array, s, s + 1);
      }
    }
    for (int k = 0; k < array.length; k++)
      System.out.print(array[k] + "  ");
  }
  static void swap(double[] array, int id1, int id2) {
    double temp = array[id1];
    array[id1] = array[id2];
    array[id2] = temp;
  }
}