package aeroplane;

import java.util.NoSuchElementException;

public class Seat {

  private int num;
  private char ch;
  private String seatNum;

  public Seat(int num, char ch) throws MalformedDataException {
    if (num < 1 || num > 50 || ch < 'A' || ch > 'F') {
      throw new MalformedDataException();
    }
    this.num = num;
    this.ch = ch;
    this.seatNum = Integer.toString(num) + Character.toString(ch);
  }

  public int getNum() {
    return num;
  }

  public char getCh() {
    return ch;
  }

  public boolean isEmergencyExit() {
    return getNum() == 1 || getNum() == 10 || getNum() == 30;
  }

  public boolean hasNext() {
    return seatNum != "50F";
  }

  public Seat next() throws MalformedDataException {
    if (hasNext()) {
      if (getCh()=='F') {
        return new Seat(num+1, 'A');
      } else {
        return new Seat(num, (char)(ch+1));
      }
    } else {
      throw new NoSuchElementException();
    }

  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Seat)) {
      return false;
    }
    Seat seat = (Seat) obj;
    return num == seat.getNum() && ch == seat.getCh();
  }
}
