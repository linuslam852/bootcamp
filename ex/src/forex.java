public class forex {
    public static void main(String[] args) throws Exception {
      int sum = 0;
      int j = 0;
      for(int i = 0; i< 100; i++)
      {
        if(i%2==1)
        {
          if(sum+i >= 200)
          {
            break;
          }
          sum += i;
          j = i;
        }
        
      }
       
        System.out.println("i=" + j + ",sum="+ sum);
    }
}
