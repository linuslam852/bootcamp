
public class demo {

  public static void main(String[] args) {
    int[] arr = new int[] {10, 18, -5, 16, 8, 15, 20};
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secMax = max;
        max = arr[i];
      } else if (arr[i] > secMax) {
        secMax = arr[i];
      }
    }
    System.out.println("max:" + max);
    System.out.println("secMax:" + secMax);
  }
}
