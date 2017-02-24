/**
   * file: Lab2_prob4.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 3.15
   * due date: February 9, 2017
   * version: 1.1
   * 
   * Checks to see if you won a three digit lottery with 1 match winning $1,000,
   * matching all digits will win $3,000, and an exact match wins $10,000.
   */

import java.util.Scanner;

public class Lab2_prob4 {
  public static void main(String[] args) {
    int lottery = (int)(Math.random() * 1000);
    
    Scanner input = new Scanner(System.in);    
    System.out.print("Enter a three digit lottery pick: ");
    int guess = input.nextInt();
    
    int lotteryDigit1 = lottery / 100;
    int lotteryDigit2 = (lottery % 100) / 10;
    int lotteryDigit3 = (lottery % 100) % 10;
    
    int guessDigit1 = guess / 100;
    int guessDigit2 = (guess % 100) / 10;
    int guessDigit3 = (guess % 100) % 10;
    
    System.out.println("Lottery number is " + lottery);
    
    if (guess == lottery)
      System.out.println("Exact match: you win $10,000");
    else if ((guessDigit1 == lotteryDigit1
        && guessDigit2 == lotteryDigit3
        && guessDigit3 == lotteryDigit2)
        || (guessDigit2 == lotteryDigit1
        && guessDigit1 == lotteryDigit3
        && guessDigit3 == lotteryDigit2)
        || (guessDigit3 == lotteryDigit1
        && guessDigit2 == lotteryDigit3
        && guessDigit1 == lotteryDigit2)
        || (guessDigit2 == lotteryDigit1
        && guessDigit3 == lotteryDigit3
        && guessDigit1 == lotteryDigit2)
        || (guessDigit3 == lotteryDigit1
        && guessDigit1 == lotteryDigit3
        && guessDigit2 == lotteryDigit2))
      System.out.println("Match all digits: you win $3,000");
    else if (guessDigit1 == lotteryDigit1
        || guessDigit1 == lotteryDigit2
        || guessDigit1 == lotteryDigit3
        || guessDigit2 == lotteryDigit1
        || guessDigit2 == lotteryDigit2
        || guessDigit2 == lotteryDigit3
        || guessDigit3 == lotteryDigit1
        || guessDigit3 == lotteryDigit2
        || guessDigit3 == lotteryDigit3)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no match");
  }
}
