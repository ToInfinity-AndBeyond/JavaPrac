package aeroplane;

public class Economy_Passengers extends Passenger {

  private String firstName;
  private String surName;
  private int age;

  public Economy_Passengers(String firstName, String surName, int age) {
    if (age < 0) {
      throw new IllegalArgumentException();
    }
    this.firstName = firstName;
    this.surName = surName;
    this.age = age;

  }

  @Override
  public boolean isAdult() {
    return age >= 18;
  }

  public String toString() {
    return firstName + " " + surName + " is " + age + "years old economy class passenger.";
  }
}
