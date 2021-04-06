/*
IS 4010: Lab 9
Partners: Alec Rezelj, Kiley Hardcorn
Date: April 06, 2021
*/

public class Person {
  public String name;
  public int age;
  public String color;
  // Above is decalring variables.

  public Person(String personName, int personAge, String personColor) {
    name = personName;
    color = personColor;
    age = personAge;
  }

  // Above are constructor methods.

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }
  // Above are accessor methods.
}