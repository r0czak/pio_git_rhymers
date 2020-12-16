package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

  public DefaultCountingOutRhymer baseRhymer = new DefaultCountingOutRhymer();
  
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
