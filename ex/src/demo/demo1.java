
import java.util.Arrays;

public class demo1 {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -100, 34};
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }

    }
    System.out.println(Arrays.toString(arr));
  }
}
