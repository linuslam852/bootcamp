package ex;
import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int x1 = 0;
    int x2 = 1;
    int[] arr = new int[15];
    arr[0] = 1;
    for(int i = 1; i < 15; i++){
      arr[i] = x1 + x2;
      x1 = arr[i-1];
      x2 = arr[i];
    }
    System.out.println(Arrays.toString(arr));
  }
}