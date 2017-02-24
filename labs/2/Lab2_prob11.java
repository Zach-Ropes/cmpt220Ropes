/**
   * file: Lab2_prob11.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 4.26
   * due date: February 9, 2017
   * version: 1.1
   * 
   * Counts how many nichles, dimes, etc. are left in a dollar amount
   * by using strings for more precise calculation.
   */

import java.util.Scanner;

public class Lab2_prob11 {
  public static void main(String[] args) {   
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter a dollar amount to two decimal places: ");
    String amount = input.nextLine();
    
    int place = amount.indexOf(".");
    String dol = amount.substring(0, place);
    String cen = amount.substring(place + 1);
    int numofdollars = Integer.parseInt(dol);
    int cents = Integer.parseInt(cen);
    
    int numofquarters = cents / 25;
    cents = cents % 25;
    
    int numofdimes = cents / 10;
    cents = cents % 10;
    
    int numofnickels = cents / 5;
    cents = cents % 5;
    
    int numofpennies = cents / 1;

    System.out.println("Your amount " + amount + " consists of"); 
    System.out.println("    " + numofdollars + " dollars");
    System.out.println("    " + numofquarters + " quarters ");
    System.out.println("    " + numofdimes + " dimes"); 
    System.out.println("    " + numofnickels + " nickels");
    System.out.println("    " + numofpennies + " pennies");
  }
}