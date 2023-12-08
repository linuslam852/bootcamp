
public class demo6 {
  public static void main(String[] args) {
  int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;
  int[] numbers = new int[] {10, 2, 200, 2000, 2000, 2, 2};
  for(int i = 0; i < numbers.length; i++){
    if(numbers[i] > max){
      max = numbers[i];
    }
    if(numbers[i] < min){
      min = numbers[i];
    }
  }
  int[] counts = new int[max - min + 1];
  for(int i = 0; i < numbers.length; i++){
    counts[numbers[i] - min]++;
  }
  int maxCounts = 0;
  for(int i = 0; i < counts.length; i++){
    if(counts[i] != 0 && counts[i] > maxCounts){
      maxCounts = counts[i];
    }
    
  }
  System.out.println("Max count = " + maxCounts);
  }


}
