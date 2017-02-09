import java.util.Scanner;

public class Lab2_prob12 {
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
    String letgrade = "nothing yet";
    
    if (finalgrade >= 95)
      letgrade = "A";
    else if (finalgrade >= 90)
      letgrade = "A-";
    else if (finalgrade >= 87)
      letgrade = "B+";
    else if (finalgrade >= 83)
      letgrade = "B";
    else if (finalgrade >= 80)
      letgrade = "B-";
    else if (finalgrade >= 77)
      letgrade = "C+";
    else if (finalgrade >= 73)
      letgrade = "C";
    else if (finalgrade >= 70)
      letgrade = "C-";
    else if (finalgrade >= 65)
      letgrade = "D+";
    else if (finalgrade >= 60)
      letgrade = "D";
    else if (finalgrade < 60)
      letgrade = "F";
    
    
    System.out.println("Your final grade is " + letgrade);
  }
}
