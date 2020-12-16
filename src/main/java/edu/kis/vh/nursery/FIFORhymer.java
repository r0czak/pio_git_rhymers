package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

  public defaultCountingOutRhymer baseRhymer = new defaultCountingOutRhymer();

  @Override
  public int countOut() {
    while (!callCheck())

      baseRhymer.countIn(super.countOut());

    int ret = baseRhymer.countOut();

    while (!baseRhymer.callCheck())

      countIn(baseRhymer.countOut());

    return ret;
  }
}
