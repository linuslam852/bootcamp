package demo;
public class forex8 {
  public static void main(String[] args) {
    int space = 2;
    int star = 3;
    int times = 6;
    int total = (space + star) * (times+1);
    int stcnt = 0;
    int spcnt = 0;
    for(int i = 0; i < total; i++){
      if(stcnt < star){
          System.out.print("*");
          stcnt++;
      }else{
        if(spcnt < space){
          System.out.print(" ");
          spcnt++;
        }else{
          stcnt = 0;
          spcnt = 0;
        }
      }
    }
  }
}
