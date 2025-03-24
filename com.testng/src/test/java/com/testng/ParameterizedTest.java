package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParameterizedTest{
  
  @Test
  @Parameters({"val1", "val2"})
  public void sum(int v1, int v2) {
      int finalsum = v1 + v2;
      System.out.println("The final sum" + finalsum);
  }

  @Test
  @Parameters({"val1", "val2"})  
  public void sum1(int v1, int v2) {
      int finalsum1 = v1 - v2;
      System.out.println("The final subtraction" + finalsum1);
  }
}
