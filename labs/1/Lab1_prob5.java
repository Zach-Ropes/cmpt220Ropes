import java.util.Scanner;

public class Lab1_prob5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the following as percentages...");
    System.out.print("midterm exam: ");
    double midterm = input.nextDouble();
    System.out.print("final exam: ");
    double finalex = input.nextDouble();
    System.out.print("projects: ");
    double projects = input.nextDouble();
    System.out.print("homework and labs: ");
    double hw = input.nextDouble();
    
    double finalgrade = (midterm * .2) + (finalex * .2) + (projects * .2) + (hw * .4);
    System.out.println("Your final grade is " + finalgrade + "%");
  }
}