/**
   * file: Prob7_31.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 5, problem 7.31
   * April 3, 2017
   * version: 1.0
   * 
   * Prompts the user to enter two sorted lists and merges them.
   */  
import java.util.Scanner;
   
public class Prob7_31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter list1: ");
    int list1length = input.nextInt();
    int[] list1 = new int[list1length];
    for (int i = 0; i < list1.length; i++)
      list1[i] = input.nextInt();
  
    System.out.print("Enter list2: ");
    int list2length = input.nextInt();
    int[] list2 = new int[list2length];
    for (int j = 0; j < list2.length; j++)
      list2[j] = input.nextInt();
  
    int[] merged = new int[list1.length + list2.length];
    merged = merge(list1, list2);
    System.out.print("The merged list is ");
    for (int s = 0; s < merged.length; s++)
      System.out.print(merged[s] + " ");
  }
  public static int[] merge(int[] list1, int[] list2) {
    int[] merged = new int[list1.length + list2.length];
    int m = 0; 
    int l1 = 0;
    int l2 = 0;
    boolean l2done = false;
    boolean l2done = false;

    while (!l1done || !l2done) {

      if (l1 == list1.length) 
        l1done = true;
      if (l2 == list2.length) 
        l2done = true;

      if (l1done && l2done) 
        break;

      if (!l1done && l2done) 
        merged[m++] = list1[l1++];
      else if (!l2done && l1done) 
        merged[m++] = list2[l2++];
      else if (list1[l1] <= list2[l2]) 
        merged[m++] = list1[l1++];
      else if (list2[l2] <= list1[l1]) 
        merged[m++] = list2[l2++];
    }
    return merged;
  }
}