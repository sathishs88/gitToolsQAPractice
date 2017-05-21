package testNGpractice;

import org.testng.annotations.Test;

public class ClassB extends CommonClass{
  @Test(invocationCount=3, invocationTimeOut=10000, threadPoolSize=2)
  public void f() {
	  System.out.println("Class B");
  }
}
