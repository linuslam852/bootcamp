public class Person {
  private String firstName;
  private String lastName;
  private int age;

  public Person(){

  }
  
  public Person(String firstName,String lastName, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
  
  public Person(String firstName){
    this.firstName = firstName;
    this.lastName = "";
  }

  public Person(String firstName,String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getFullName(){
    if(this.lastName.isEmpty()){
      return this.firstName;
    }
    return this.firstName.concat(" ").concat(this.lastName).toUpperCase();
  }

  public static void main(String[] args){
    Person p1 = new Person();
    Person p2 = new Person();
    p1.setFirstName("John");
    p2.setFirstName("Peter");

    Person p3 = p1;
    p3.setFirstName("Mary");

    Person p4 = new Person("Tommy");
    p4.setFirstName("Jenny");

    Person p5 = new Person("Ken", "Wong");

    System.out.println(p4.getFirstName());
    System.out.println(p3.getFirstName());
    System.out.println(p1.getFirstName());
    System.out.println(p2.getFirstName());
    System.out.println("p5 Full name = " + p5.getFullName());

    Person p6 = new Person("christy");
    System.out.println("p6 Full name = " + p6.getFullName());

  }

}