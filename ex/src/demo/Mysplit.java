package demo;

import java.util.Arrays;

public class Mysplit {
  public static void main(String[] args) {
    String str = "abc,def,ijk,xyz";
    String[] str2 = Mysplit(str,',');
    System.out.println(Arrays.toString(str2));
  }

  public static String[] Mysplit(String str, char c){
    String[] strings = new String[str.length()];
    char[] temp2 = new char[str.length()];
    int c1= ' ';
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) != c){
        strings[i].concat(str.charAt(i).toString);
      }else{
      }
    }
    return strings;
  }
}
