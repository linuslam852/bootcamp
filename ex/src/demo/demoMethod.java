
public class demoMethod {
  public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = "efgh";
    String s3 = "ab";
    String s4 = "abcbcdabc";
    String s5 = "bcd";
    System.out.println(append(s1,s2));
    System.out.println("LastChar : " + getLastChar(s2));
    System.out.println("isStartedWith : " + isStartedWith(s1, s3));
    System.out.println(remove(s4, s5));
  }
  public static String append(String s1, String s2){
    return s1.concat(s2);

  }

  public static char getLastChar(String s){
    return s.charAt(s.length()-1);
  }

  public static boolean isStartedWith(String s, String prefix){
    for(int i = 0; i < prefix.length(); i++){
      if(s.charAt(i) != prefix.charAt(i)){
        return false;
      }
    }
    return true;  
  }

  public static String remove(String s, String toBeRemoved){
    return s.replace(toBeRemoved,"");  
  }
}
