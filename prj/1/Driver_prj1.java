/**
   * file: Driver_prj1.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: project 1
   * March 26, 2017
   * version: 1.0
   * 
   * Does Convolution of two arrays
   */  

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // write your code here
    System.out.print("Enter length of first array: ");
    int vfirstlength = input.nextInt();
    System.out.print("Enter length of second array: ");
    int vsecondlength = input.nextInt();
    
    double vfirst[] = new double[vfirstlength];
    double vsecond[] = new double[vsecondlength];
    
    System.out.print("Enter variables of first array: ");
    for (int i = 0; i < vfirstlength; i++)
      vfirst[i] = input.nextDouble();
  
    System.out.print("Enter variables of second array: ");
    for (int k = 0; k < vsecondlength; k++)
      vsecond[k] = input.nextDouble();
    
    double[] vresult = new double[(vfirst.length + vsecond.length) - 1];
    vresult = convolveVectors(vfirst, vsecond);
    
    for (int p = 0; p < vresult.length; p++){
      System.out.print(Math.round(vresult[p]) + " ");
    }
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here
    for (int r = 0; r < vResult.length; r++) {
      for (int s = 0; s < vFirst.length; s++) {
        if ((r - s) >= 0 && (r - s) <= (vFirst.length - 1))
          vResult[r] += vFirst[r - s] * vSecond[s];
      }
    }
    return vResult;  
  }
}
