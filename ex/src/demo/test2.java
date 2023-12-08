public class test2 {
  // LeetCode: 171

  public int titleToNumber(String columnTitle) {
      int number = 0;
      int idx = 0;
      int ascii = -1;
      for (int i = columnTitle.length() - 1; i >= 0; i--) {
          ascii = columnTitle.charAt(i) - 'A' + 1;
          // the 1st char scenario
          if (i == columnTitle.length() - 1) {
              number += ascii; //
              continue;
          }
          // 2nd char or above scenario
          number += Math.pow(26, ++idx) * ascii; 
      }
      return number;
      // Z -> AA
      // ZZ (26^1 x 26 + 26) 
      // ZZZ (26^2 x 26 + 26^1 x 26 + 26)
      // AAA (26^2 + 1)
  }
}
