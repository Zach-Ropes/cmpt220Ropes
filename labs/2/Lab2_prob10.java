import java.util.Scanner;

public class Lab2_prob10 {
  public static void main(String[] args) {
    int num1 = (int)((Math.random() * 25)+ 65);
    char let1 = (char)num1;
    int num2 = (int)((Math.random() * 25)+ 65);
    char let2 = (char)num2;
    int num3 = (int)((Math.random() * 25)+ 65);
    char let3 = (char)num3;
    
    int dig4 = (int)(Math.random() * 10000);
   
    System.out.println("The generated plate number is " + let1 + let2 + let3 + dig4);
  }
}
