// header
// Problem 5.13

public class Lab3_prob4 {
  public static void main(String[] args) {
    int n = 0;
    
    while (Math.pow(n, 3) < 12000) {
      n++;
    }
    if (Math.pow(n, 3) > 12000)
      n--;
    

    System.out.println("The smallest integer n such that n^3 is less than 12,000 is " + n);
  }
}