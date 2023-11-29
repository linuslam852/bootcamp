package demo;
public class forex2{
  public static void main(String[] args) throws Exception {
    int sum = 0;
    int j = 0;
    for(int i = 0; sum + i< 201; i++){
      if(i%2==1){
        sum += i;
        j = i;
      }
    }
      System.out.println("i=" + j + ",sum="+ sum);
  }
}
