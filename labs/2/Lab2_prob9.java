/**
   * file: Lab2_prob9.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 4.15
   * due date: February 9, 2017
   * version: 1.1
   * 
   * Finds corresponding number to the letter tyed in on a normal phone.
   */

import java.util.Scanner;

public class Lab2_prob9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a letter: ");
    String letter = input.nextLine();
    int num = 0;
    
    if (letter.equals("A") 
        || letter.equals("B") 
        || letter.equals("C")
        || letter.equals("a")
        || letter.equals("b")
        || letter.equals("c"))
      num = 2;
    else if (letter.equals("D") 
        || letter.equals("E") 
        || letter.equals("F")
        || letter.equals("d")
        || letter.equals("e")
        || letter.equals("f"))
      num = 3;
    else if (letter.equals("G") 
        || letter.equals("H") 
        || letter.equals("I")
        || letter.equals("g")
        || letter.equals("h")
        || letter.equals("i"))
      num = 4;
    else if (letter.equals("J") 
        || letter.equals("K") 
        || letter.equals("L")
        || letter.equals("j")
        || letter.equals("k")
        || letter.equals("l"))
      num = 5;
    else if (letter.equals("M") 
        || letter.equals("N") 
        || letter.equals("O")
        || letter.equals("m")
        || letter.equals("n")
        || letter.equals("o"))
      num = 6;
    else if (letter.equals("P") 
        || letter.equals("Q") 
        || letter.equals("R")
        || letter.equals("S")
        || letter.equals("p")
        || letter.equals("q")
        || letter.equals("r")
        || letter.equals("s"))
      num = 7;
    else if (letter.equals("T") 
        || letter.equals("U") 
        || letter.equals("V")
        || letter.equals("t")
        || letter.equals("u")
        || letter.equals("v"))
      num = 8;
    else if (letter.equals("W") 
        || letter.equals("X") 
        || letter.equals("Y")
        || letter.equals("Z")
        || letter.equals("w")
        || letter.equals("x")
        || letter.equals("y")
        || letter.equals("z"))
      num = 9;
    else
      System.out.println(letter + " is an invalid input");
    
    System.out.println("The corresponding number is " + num);
  }
}

