package demo;
import java.util.Arrays;
public class demo3 {
  public static void main(String[] args) {
    int[] arr = new int[]{100, 4, 1050, 500};
    int temp = 0;
    int maxIndex = 0;
    for(int i = 0; i < arr.length-1; i++){
      if(arr[i+1] < arr[maxIndex]){
        temp = arr[maxIndex];
        arr[maxIndex] = arr[i+1];
        arr[i+1] = temp;
        maxIndex = i+1;
      }else if(arr[i+1] > arr[maxIndex]){
        maxIndex = i+1;
      }

      }
      System.out.println(Arrays.toString(arr));
  }
}
