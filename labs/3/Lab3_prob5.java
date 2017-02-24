/**
   * file: Lab3_prob5.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 6.2
   * February 23, 2017
   * version: 1.1
   * 
   * Calculates the sum of all the digits of
   * a number.
   */  

import java.util.Scanner;

public class Lab3_prob5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    long num = input.nextLong();
    
    System.out.println("The sum of the digits of " + num + " is " + sumDigits(num));
  }
  //second method sumDigits
  public static int sumDigits(long n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n = n / 10;      
    }
    return sum;
  }
}