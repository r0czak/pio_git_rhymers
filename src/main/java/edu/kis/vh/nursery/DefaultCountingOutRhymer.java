package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  public static final int size = 12;
  public static final int error = -1;
  private final int[] numbers = new int[size];

  public int total = error;

  public void countIn(int in) {
    if (!isFull())
      numbers[++total] = in;
  }

  public boolean callCheck() {
    return total == error;
  }

  public boolean isFull() {
    return total == size - 1;
  }

  protected int peekaboo() {
    if (callCheck())
      return error;
    return numbers[total];
  }

  public int countOut() {
    if (callCheck())
      return error;
    return numbers[total--];
  }

}
