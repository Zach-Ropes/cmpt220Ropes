/**
   * file: PaceCalc2.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: Project 2
   * April 28, 2017
   * version: 1.0
   * 
   * converts minutes to hours and minutes
   */  
   
package Ropes;

public class PaceCalc2 {
  public int pacehour2;
  public int pacemin4;
  
  public PaceCalc2(int pacehour2, int pacemin4) {
    this.pacehour2 = pacehour2;
    this.pacemin4 = pacemin4;
  }
  
  public static PaceCalc2 calculate2(int minutes) {
    String paceminutes2 = (double)(minutes / 60) + "";
    int place4 = paceminutes2.indexOf(".");
    String pacehour = paceminutes2.substring(0, place4);
    String pacemin3 = paceminutes2.substring(place4);
    int pacehour2 = Integer.parseInt(pacehour);
    int pacemin4 = (int)Math.round((Double.parseDouble(pacemin3) * 60));
    
    return new PaceCalc2(pacehour2, pacemin4);
  }
}