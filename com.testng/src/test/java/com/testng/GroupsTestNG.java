package com.testng;

import org.testng.annotations.Test;

public class GroupsTestNG {
  @Test(alwaysRun = true, groups = {"regressionTest"})
  public void f() {
      System.out.println("Login the applications");
  }

  @Test(alwaysRun = true, groups = {"regressionTest","smokeTest"})
  public void f1() {
      System.out.println("Access");
  }

  @Test(alwaysRun = true, groups = {"regressionTest","smokeTest","sanityTest"})
  public void f2() {
      System.out.println("Logout the Application");
  }
}
