/**
   * file: Prob7_32.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 5, problem 7.32
   * April 3, 2017
   * version: 1.0
   * 
   * Partitions the list given.
   */  
import java.util.Scanner;
   
public class Prob7_32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a list:");
    int length = input.nextInt();
    int[] list = new int[length];
    for (int i = 0; i < length; i++) 
      list[i] = input.nextInt();
    
    partition(list);
      
    System.out.print("After the partition, the list is ");
    for (int j = 0; j < list.length; j++)
      System.out.print(list[j] + " ");
  }

  public static int partition(int[] list) {
    int part = list[0];
    int temp = 0;
    int loc = 0;
    int big = list.length - 1;
    
    while (loc < big) {
      if (part > list[loc + 1]) {
        list[loc] = list[loc + 1];
        list[loc + 1] = part;
        loc++;
      }
      else {
        temp = list[big];
        list[big] = list[loc + 1];
        list[loc + 1] = temp;
        big--;
      }
    }
    return loc;
  }
}