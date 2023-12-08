
import java.util.Arrays;

public class demo2 {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -20, 4, 100, 500, 600};
    int targetIndex = 1;
    int temp = 0;
    for (int i = targetIndex; i < arr.length - 1; i++) {
      temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
