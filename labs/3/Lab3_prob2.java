/**
   * file: Lab3_prob2.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 5.7
   * February 23, 2017
   * version: 1.1
   * 
   * Finds tuition cost after ten years as well 
   * as the total four year cost after the tenth year.
   */  

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