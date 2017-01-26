import java.util.Scanner;

public class Lab1_prob3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityrate = input.nextDouble();
    
    double gratuityrateact = gratuityrate * .01;
    double gratuity = subtotal * gratuityrateact;
    double total = gratuity + subtotal;
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}