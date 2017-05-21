package testNGpractice;

import org.testng.annotations.Test;

public class ClassC extends CommonClass{
  @Test(alwaysRun=true)
  public void f() {
	  System.out.println("Class C");
  }
}
