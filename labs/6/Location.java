/**
   * file: Location.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 6, problem 9.13
   * March 20, 2017
   * version: 1.0
   * 
   * Finds location of largest point and array and also returns the largest point
   */  
   
package Ropes;
   
public class Location {
  public int row;
  public int column;
  public double maxValue;
  
  public Location(int row, int column, double maxValue) {
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }

  public static Location locateLargest(double[][] a) {
    double maxValue = a[0][0];
    int row = 0;
    int column = 0;
    
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (maxValue < a[i][j])
          maxValue = a[i][j];
          row = i - 1;
          column = j - 1;
      }
    }
    return new Location(row, column, maxValue);
  }
}