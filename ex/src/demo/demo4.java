package demo;
import java.util.Arrays;


public class demo4 {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    int[] arr = new int[20];
    arr[0] = 1;
    while(arr[i]+j < 1000){
      arr[i+1] = j + arr[i];
      j = arr[i];
      i++;
      System.out.println(Arrays.toString(arr));
    }
  }
}
