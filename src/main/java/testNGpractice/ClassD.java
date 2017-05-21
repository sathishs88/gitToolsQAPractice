package testNGpractice;

import org.testng.annotations.Test;

public class ClassD extends CommonClass{
  @Test(expectedExceptions=ArithmeticException.class)
  public void f() {
	  System.out.println("Class D");
	  int k = 1/0;
  }
}
