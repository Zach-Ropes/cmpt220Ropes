import java.util.Scanner;

public class Class4_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int counter = 0;
    while ( counter < 1000000 ) {
      System.out.printf("%d: This is java's PI: %20.15f\n", counter, Math.PI);
      counter = counter + 1;
      //counter+=1;
      //counter++;
    }
    //for (int count = 0; count < 3; count++)
    
    
    
    
  }
}
// while( true ) <------- while loop style
// for( ; ; ) <------- infinite loop (for loop style)