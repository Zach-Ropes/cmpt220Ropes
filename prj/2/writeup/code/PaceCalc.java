/**
   * file: PaceCalc.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: Project 2
   * April 28, 2017
   * version: 1.0
   * 
   * gets time in minutes and seconds
   */  
   
package Ropes;

public class PaceCalc {
  public int pacemin2;
  public double pacesec2;
  
  public PaceCalc(int pacemin2, double pacesec2) {
    this.pacemin2 = pacemin2;
    this.pacesec2 = pacesec2;
  }
  
  public static PaceCalc calculate(double distance1, double distance2, double time){
    double finalpacetime = time * (distance2 / distance1);
    String finalpacetime2 = (finalpacetime / 60) + "";
    int place3 = finalpacetime2.indexOf(".");
    String pacemin = finalpacetime2.substring(0, place3);
    String pacesec = finalpacetime2.substring(place3);
    int pacemin2 = Integer.parseInt(pacemin);
    double pacesec2 = (Math.round((Double.parseDouble(pacesec) * 60) * 10.0) / 10.0 );
    
    return new PaceCalc(pacemin2, pacesec2);
  }
}