package demo;
public class forex7 {
  public static void main(String[] args) {
    String str = "abcdefghijk";
    int j = 0;
    for(int i =0;i < str.length();i++){
      System.out.print(str.charAt(i));
      if(++j % 4 == 0 || j == str.length()){
        System.out.println();
      }
    }
  }
}
