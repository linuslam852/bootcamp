
import java.util.Arrays;

public class demoMethod2 {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 5, 10};
    sum(arr);
    System.out.println(Arrays.toString(arr));
    String s1 = "John";
    String s2 = String.valueOf("John");
    String s3 = new String("John");
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
     System.out.println(System.identityHashCode("John"));
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s2 == s3);
  }
  
  public static void sum(int[] arr){
    for(int i = 0; i < arr.length; i++){
       arr[i] += 1;
    }
  }

}
