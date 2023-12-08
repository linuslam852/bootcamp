public class demoReverse {
  public static void main(String[] args) {
      String str = "abcdefg";
      System.out.println(reverse(str));
      System.out.println(reverse2(str));
  }

  public static String reverse(String s){
    char[] arr = new char[s.length()];
    int j = s.length()-1;
    for(int i = 0; i < s.length(); i++){
        arr[i] = s.charAt(j--);
    }
    return String.valueOf(arr);
  }

  public static String reverse2(String s){
    String result = "";
    for(int i = s.length() -1; i >= 0 ; i--){
        result = result + s.charAt(i);
    }
    return result;
  }
}
