import java.util.Scanner;

public class Lab2_prob11 {
  public static void main(String[] args) {   
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter a dollar amount to two decimal places: ");
    String amount = input.nextLine();
    
    int place = amount.indexOf(".");
    String dol = amount.substring(0, place);
    String cen = amount.substring(place + 1);
    int numofdollars = Integer.parseInt(dol);
    int cents = Integer.parseInt(cen);
    
    int numofquarters = cents / 25;
    cents = cents % 25;
    
    int numofdimes = cents / 10;
    cents = cents % 10;
    
    int numofnickels = cents / 5;
    cents = cents % 5;
    
    int numofpennies = cents / 1;

    System.out.println("Your amount " + amount + " consists of"); 
    System.out.println("    " + numofdollars + " dollars");
    System.out.println("    " + numofquarters + " quarters ");
    System.out.println("    " + numofdimes + " dimes"); 
    System.out.println("    " + numofnickels + " nickels");
    System.out.println("    " + numofpennies + " pennies");
  }
}