/**
   * file: Prob7_20.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 5, problem 7.20
   * April 3, 2017
   * version: 1.0
   * 
   * Reads 10 numbers and displays them sorted out using selection sort
   */  
import java.util.Scanner;
   
public class Prob7_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] list = new double[10];
    System.out.print("Enter an array of ten doubles: ");
    for (int h = 0; h < list.length; h++)
      list[h] = input.nextDouble();
  
    selectionSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
  
  public static void selectionSort(double[] list) {
    for (int i = 9; i >= 0 ; i--) {
      double currentMax = list[i];
      int currentMaxIndex = i;

      for (int j = i - 1; j >= 0; j--) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }

      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  }
}