import java.util.Scanner;

public class Lab2_prob6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of sides: ");
    double n = input.nextDouble();
    System.out.print("Enter the side: ");
    double s = input.nextDouble();
    
    double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

    System.out.println("The area of the polygon is " + area);
  }
}
