/**
   * file: Lab2_prob3.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 3.11
   * due date: February 9, 2017
   * version: 1.1
   * 
   * Finds how many days are in the month of 
   * the year entered also finding leap years.
   */

import java.util.Scanner;

public class Lab2_prob3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a month(where 1 = January) and a year: ");
    int month = input.nextInt();
    int year = input.nextInt();
    boolean isleapyear =
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    
    if (month == 1)
      System.out.print("January " + year + " had 31 days");
    else if (month == 2 && isleapyear)
      System.out.print("February " + year + " had 29 days");
    else if (month == 2)
      System.out.print("February " + year + " had 28 days");
    else if (month == 3)
      System.out.print("March " + year + " had 31 days");
    else if (month == 4)
      System.out.print("April " + year + " had 30 days");
    else if (month == 5)
      System.out.print("May " + year + " had 31 days");
    else if (month == 6)
      System.out.print("June " + year + " had 30 days");
    else if (month == 7)
      System.out.print("July " + year + " had 31 days");
    else if (month == 8)
      System.out.print("August " + year + " had 31 days");
    else if (month == 9)
      System.out.print("September " + year + " had 30 days");
    else if (month == 10)
      System.out.print("October " + year + " had 31 days");
    else if (month == 11)
      System.out.print("November " + year + " had 30 days");
    else if (month == 12)
      System.out.print("December " + year + " had 31 days");
  }
}