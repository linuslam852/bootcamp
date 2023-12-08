

public class Animal {
  private String species;
  private String color;
  private String sex;
  private int age;

  public void setSpecies(String species) {
    this.species = species;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSpecies() {
    return this.species;
  }

  public String getColor(String color) {
    return this.color;
  }

  public String getSex(String sex) {
    return this.sex;
  }

  public int getAge(int age) {
    return this.age;
  }

  public void eat() {
    System.out.println(this.species + "is eating");
  }

  public void sleep() {
    System.out.println(this.species + "is sleeping");
  }

}
