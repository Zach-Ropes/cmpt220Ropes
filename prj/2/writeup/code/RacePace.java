/**
   * file: RacePace.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: Project 2
   * April 28, 2017
   * version: 1.0
   * 
   * gets time in minutes and seconds
   */  
   
package Ropes;

public class RacePace {
  public int min2;
  public double sec2;
  
  public RacePace(int min2, double sec2) {
    this.min2 = min2;
    this.sec2 = sec2;
  }
  
  public static RacePace calculate(double distance1, double distance2, double time){
    double finaltime = time * Math.pow((distance2 / distance1), 1.06);
    String finaltime2 = (finaltime / 60) + "";
    int place = finaltime2.indexOf(".");
    String min = finaltime2.substring(0, place);
    String sec = finaltime2.substring(place);
    int min2 = Integer.parseInt(min);
    double sec2 = (Math.round((Double.parseDouble(sec) * 60) * 10.0) / 10.0 );
    
    return new RacePace(min2, sec2);
  }
}
