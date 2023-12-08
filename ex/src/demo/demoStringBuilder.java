public class demoStringBuilder {
  public static void main(String[] args) {
    StringBuilder y = new StringBuilder("abc");
    y.append("def").append("def");
    System.out.println(y.toString());

    int counter = 4;
    int k = 0;
    StringBuilder c = new StringBuilder("");
    while(counter-- > 0){
      for(int j = 0; j < 3; j++){
        c.append(++k);
      }
      if(counter != 0){
       c.append(" ");
      }
    }
    System.out.println(c.toString());


    counter = 4;

    char c1 = 'a';
    StringBuilder s = new StringBuilder("");
    while(counter-- > 0){
      for(int j = 0; j < 3; j++){
        s.append(c1);
      }
      if(counter != 0){
       s.append(" ");
      }
      c1++;
    }
    System.out.println(s.toString());
    s.equals(c);
    String s1 = "a";
    String s2 = "b";
    s1.equals(s2);
  }
  
}
