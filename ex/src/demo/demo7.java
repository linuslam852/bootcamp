package demo;
public class demo7 {
  public static void main(String[] args) {
    String str = "abcabcdpolxyzaa";
    char maxChar = ' ';
    int maxCounts = 0;
    int counts2[] = new int[26];
    
    for(int i = 0; i < str.length(); i++){
      counts2[str.charAt(i) - 'a']++;

    }

    for(int i = 0; i < counts2.length; i++){
      if(counts2[i] != 0 && counts2[i] > maxCounts){
        maxCounts = counts2[i];
        maxChar = str.charAt(i);
      }
    }
    System.out.println("Max counts = "+ maxCounts + ", char = " + maxChar);
  }

}