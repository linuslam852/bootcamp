public class foreach {
  public static void main(String[] args) {
    Integer[] integers = new Integer[]{100,-30,20};
    for(Integer i : integers){
      System.out.println("i = " + i);
    }
    
    String str = "abc,def,ijk,xyz";
    String[] parts = str.split(",");
    for(String strings : parts){
      System.out.print(strings);
      System.out.print(" ");
    }
  }

}
