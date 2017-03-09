/**
   * file: Prob6_20.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 6.20
   * March 8, 2017
   * version: 1.0
   * 
   * Finds the number of letters within a string 
   */  
   
import java.util.Scanner;
   
public class Prob6_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = input.nextLine();
    
    System.out.println("The number of letters inside the string is " + countLetters(s));
  }
  public static int countLetters(String s) {
    int count = 0;
    for (int x = 0; x < s.length(); x++) {
      char letter = s.charAt(x);
      if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))  
        count++;
    }
    return count;
  }
}