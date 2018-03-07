package com.io7m.junit5test.application;

public final class Program
{
  private int ran;

  public Program()
  {
    this.ran = 0;
  }

  public void run()
  {
    ++this.ran;
  }

  public int ran()
  {
    return this.ran;
  }
}
