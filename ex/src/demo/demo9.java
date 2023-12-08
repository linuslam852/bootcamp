
import java.util.Arrays;

public class demo9 {
  public static void main(String[] args) {
    String s = "abcabcabcabcabc";
    char[] arr1 = new char[s.length()];
    
    for(int i = 0; i < s.length(); i++){
      arr1[i] = s.charAt(i);
    }

    char[] arr2 = s.toCharArray();
    for(int i = 0; i < arr2.length; i++){
      if(arr2[i] == 'a'){
        arr2[i] = 'c';
      }
    }
     System.out.println(Arrays.toString(arr2));
  }
}
