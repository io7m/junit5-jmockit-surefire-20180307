package com.io7m.junit5test.tests;

import com.io7m.junit5test.application.Program;
import mockit.Mocked;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.Closeable;

public final class ProgramTest
{
  @Test
  public void testRun3(final @Mocked Closeable ignored)
  {
    final Program program = new Program();
    Assertions.assertEquals(0, program.ran());
    program.run();
    Assertions.assertEquals(1, program.ran());
    program.run();
    Assertions.assertEquals(2, program.ran());
  }

  @Test
  public void testRun3_NoParameter()
  {
    final Program program = new Program();
    Assertions.assertEquals(0, program.ran());
    program.run();
    Assertions.assertEquals(1, program.ran());
    program.run();
    Assertions.assertEquals(2, program.ran());
  }
}
