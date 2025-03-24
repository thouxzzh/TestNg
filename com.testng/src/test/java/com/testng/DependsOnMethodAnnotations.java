package com.testng;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnMethodAnnotations{
  @Test(priority=10)
  public void FirstTest(){
	  String a1=new String("Test2");
	  String a2=new String("Test2");
	  Assert.assertSame(a1, a2);
	  System.out.println("First Test..");
  }
  @Test(dependsOnMethods="FirstTest",priority=1)
  public void SecondTest() {
	  System.out.println("Second Test..");
  }
}