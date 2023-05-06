package aeroplane;

public class Crew_Members extends Passenger {

  private String firstName;
  private String surName;

  public Crew_Members(String firstName, String surName) {
    this.firstName = firstName;
    this.surName = surName;
  }

  @Override
  public boolean isAdult() {
    return true;
  }

  public String toString() {
    return firstName + " " + surName + " is a crew member.";
  }

}
