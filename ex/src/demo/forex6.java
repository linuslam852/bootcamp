package demo;
public class forex6 {
  public static void main(String[] args) {
    String str = "abcdefghijk";
    for(int i =0;i <= str.length()/4;i++){
      for(int j = 0 ;j < 4; j++){
        if(j+i*4>str.length()-1)
        {
          break;
        }else{
          System.out.print(str.charAt(j+i*4));
        }
      }
      System.out.println("");
    }
  }
}
