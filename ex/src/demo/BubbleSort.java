
import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = new int[] {100, 4, 1050, 500, -20, 555};
    int temp = 0;
    for (int j = 0; j < arr.length - 1; j++) {
      for (int i = 0; i < arr.length - 1 - j; i++) {
        if (arr[i] > arr[i + 1]) {
          temp = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
      }
    }

    // System.out.println(Arrays.toString(arr));
  }
}
