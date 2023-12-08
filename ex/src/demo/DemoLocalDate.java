import java.time.LocalDate;
import java.util.Date;

public class DemoLocalDate {

  public static void main(String[] args) {
      Date date = new Date();
      LocalDate localDate = LocalDate.of(2023, 12, 5);
      System.out.println(date);
      System.out.println(localDate);

      LocalDate localDate2 = LocalDate.of(2023, 12, 6);
      if(localDate.isAfter(localDate2)){
        System.out.println("localDate > localDate2");
      }else if(localDate.equals(localDate2)){
        System.out.println("localDate == localDate2");
      }else{
        System.out.println("localDate < localDate2");
      }

      System.out.println(LocalDate.of(2023,12,5).isLeapYear());

      System.out.println(localDate.getMonthValue());
      System.out.println(localDate.getMonth());
  }
}
