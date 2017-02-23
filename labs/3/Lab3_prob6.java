// header
// Problem 6.3

import java.util.Scanner;

public class Lab3_prob6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    
    String check = "";
    if (isPalindrome(num))
      check = " is ";
    else
      check = " is not ";

    System.out.println(num + check +
      "a palindrome.");
  }

  // Return if palindrome is true or false
  public static boolean isPalindrome(int num) {
    if (num == reverse(num))
      return true;
    else 
      return false;
  }

  // Return reversal of an int
  public static int reverse(int num) {
    String rev = "";
    int rem;
    while (num != 0) {
      rem = num % 10;
      num = num/10;
      rev += rem + "";
    }
    return Integer.parseInt(rev);
  }
}