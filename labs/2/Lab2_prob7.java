import java.util.Scanner;

public class Lab2_prob7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an ASCII code: ");
    int asc = input.nextInt();
    char ch = (char)asc;

    System.out.println("The character for ASCII code " + asc + " is " + ch);
  }
}

