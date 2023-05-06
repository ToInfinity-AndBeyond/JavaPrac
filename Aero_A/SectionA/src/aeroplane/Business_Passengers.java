package aeroplane;

public class Business_Passengers extends Passenger {

  private String firstName;
  private String surName;
  private int age;
  private Luxury item;

  public Business_Passengers(String firstName, String surName, int age, Luxury item) {
    if (age < 0) {
      throw new IllegalArgumentException();
    }
    this.firstName = firstName;
    this.surName = surName;
    this.age = age;
    this.item = item;

  }

  @Override
  public boolean isAdult() {
    return age >= 18;
  }

  public String toString() {
    return firstName + " " + surName + " is " + age + "years old business class passenger.";
  }


}
