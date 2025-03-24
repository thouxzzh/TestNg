
package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestPriorityPractice {
  @Ignore
  @Test(priority=2,enabled=false)
  public void a() {
	  System.out.println("A");
  }
  @Ignore
  @Test(priority=1)
  public void b() {
	  System.out.println("B");
  }
  @Test(priority=0)
  public void c() {
	  System.out.println("C");
  }
  @Test
  public void d() {
	  System.out.println("D");
  }
  @Test(priority=1)
  public void e() {
	  System.out.println("E");
  }
}
