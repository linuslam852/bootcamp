
import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
  public static void main(String[] args) {
    int target = new Random().nextInt(100)+1;
    Scanner scanner = new Scanner(System.in);
    int input;
    int min = 1;
    int max = 100; 
    do{
      System.out.println("Please input a number " + min + "-" + max);
      input = scanner.nextInt();
      if(input == target){
        System.out.println("Correct!");
      }else if(input > target && input < max){
        max = input;
      }else if(input < target && input > min){
        min = input;
      }
    }while(input != target);
    scanner.close();

  }
}
