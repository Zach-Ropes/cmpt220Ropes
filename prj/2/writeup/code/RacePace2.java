/**
   * file: RacePace2.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: Project 2
   * April 28, 2017
   * version: 1.0
   * 
   * converts minutes to hours and minutes
   */  
   
package Ropes;

public class RacePace2 {
  public int hour2;
  public int min4;
  
  public RacePace2(int hour2, int min4) {
    this.hour2 = hour2;
    this.min4 = min4;
  }
  
  public static RacePace2 calculate2(int minutes) {
    String minutes2 = (double)(minutes / 60) + "";
    int place2 = minutes2.indexOf(".");
    String hour = minutes2.substring(0, place2);
    String min3 = minutes2.substring(place2);
    int hour2 = Integer.parseInt(hour);
    int min4 = (int)Math.round((Double.parseDouble(min3) * 60));
    
    return new RacePace2(hour2, min4);
  }
}