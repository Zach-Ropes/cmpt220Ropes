/**
   * file: Prob6_8.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 6.8
   * March 8, 2017
   * version: 1.0
   * 
   * Converts celsius to fahreneit and 
   * fahrenheit to celsius
   */  

public class Prob6_8 {
  public static void main(String[] args) {

    System.out.println("Celsius     Fahrenheit      |       Fahrenheit      Celcius");
    double celsius = 40.0;
    double fahrenheit = 120.0;
    while (celsius >= 31 && fahrenheit >= 30) {
      System.out.println(celsius + "        " + celsiusToFahrenheit(celsius) +
        "           |       " + fahrenheit + "           " + 
        fahrenheitToCelsius(fahrenheit));
      celsius--;
      fahrenheit = fahrenheit - 10;
    }
  }
  //convert celsius to fahrenheit
  public static double celsiusToFahrenheit(double celsius) {
    double fahr = (9.0 / 5) * celsius + 32;
    return Math.round(fahr * 10) / 10.0;
  }
  //convert fahrenheit to celsius
  public static double fahrenheitToCelsius(double fahrenheit) {
    double cels = (5.0 / 9) * (fahrenheit - 32);
    return Math.round(cels * 100) / 100.0;
  }
}