import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = new int[]{100, -30, 40, 22, 44};
    for (int i = 1; i < arr.length; i++) {
        int base = arr[i], j = i - 1;
        while (j >= 0 && arr[j] > base) {
            arr[j + 1] = arr[j]; 
            j--;
        }
        arr[j + 1] = base;
        System.out.println(Arrays.toString(arr));
    }

    }
}
