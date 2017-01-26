import java.util.Scanner;

public class Lab1_prob4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number between 0 and 1000: ");
    int integer = input.nextInt();
    
    int digit1 = integer % 10;
    int digit2 = (integer/10) % 10;
    int digit3 = (integer/100) % 10;
    int sum = digit1 + digit2 + digit3;
    System.out.println("The sum of the digits is " + sum);
  }
}