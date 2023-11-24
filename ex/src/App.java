public class App {
    public static void main(String[] args) throws Exception {
        int total = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i <= 100;i++){
           if(i<= 50){
            if(i%2 == 1){
            sum1 = sum1 + i;    
            }
           }else if(i%2 == 0){
            sum2 = sum2 +i;
           }
        }
        total = sum1 * sum2;
        System.out.println(total);
    }
}
