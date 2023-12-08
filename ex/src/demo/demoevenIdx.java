

public class demoevenIdx {
  public static void main(String[] args) {
    String str = "abcdefghijk";
    int strlength = str.length() % 2 == 0 ? str.length()/2 : str.length()/2+1;
    char[] arr = new char[strlength];
    int j = 0;
    for(int i = 0; i < str.length(); i++){
      if(i%2 == 1){
        continue;
      }
      arr[j++] = str.charAt(i);
    }
    System.out.println(String.valueOf(arr));
    System.out.println(evenIdx(str));

    
  }
  public static String evenIdx(String s){
    int strlength = s.length() % 2 == 0 ? s.length()/2 : s.length()/2+1;
    char[] arr = new char[strlength];
    int j = 0;
    for(int i = 0; i < s.length(); i++){
      if(i%2 == 1){
        continue;
      }
      arr[j++] = s.charAt(i);
    }
    return String.valueOf(arr);
  }

}
