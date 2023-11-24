public class forex3 {
  public static void main(String arg[]){
    String str = "abc pol ijk def xyz";
    char target = 'f';
    int n = 0;
    for(int i = 0; i<str.length();i++){
      if(str.charAt(i) == target){ 
        n = i;
      }
    }
    System.out.println(n);
  }
}
