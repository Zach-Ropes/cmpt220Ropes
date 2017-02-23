// header
// Problem 5.7

public class Lab3_prob2 {
  public static void main(String[] args) {

    int total = 0;
    int tuition = 10000;
    int tenthyeartuition = 0;
    
    for (int year = 1; year <= 14; year++) {
      tuition +=(tuition * .05);
      
      if (year == 10)
        tenthyeartuition = tuition;
    
      if (year > 10)
        total = total + tuition;  
    }

    System.out.println("Tuition in ten years is: $" + tenthyeartuition);
    System.out.println("Total coat for four years' worth of tuition after the " +
      "tenth year: $" + total);
  }
}