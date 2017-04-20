/**
   * file: Prob10_2.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 7, problem 10.2
   * March 20, 2017
   * version: 1.0
   * 
   * Uses feet and inches instead of just height in inches for BMI
   */  
   
public class Prob10_2 {
  private String name;
  private int age;
  private double weight; // in pounds
  private int feet; // in feet
  private double inches; // in inches
  public static final double KILOGRAMS_PER_POUND = 0.45359237; 
  public static final int FEET_PER_INCH = 12;
  
      
  public Prob10_2(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.feet = feet;
    this.inches = inches
  }
 
  public Prob10_2(String name, double weight, int feet, double inches) {
    this(name, 20, weight, feet, inches);
  }
 
  public double getBMI() {
    double bmi = weight * KILOGRAMS_PER_POUND / 
      (((feet * FEET_PER_INCH) + inches) * ((feet * FEET_PER_INCH) + inches));
    return Math.round(bmi * 100) / 100.0;
  }

  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }

  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
 
  public double getWeight() {
    return weight;
  }
 
  public double getHeight() {
    return height;
  }
}