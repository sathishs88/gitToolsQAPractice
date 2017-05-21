package testNGpractice;

import org.testng.annotations.Test;

public class ClassA extends CommonClass{

	public ClassA(){
		System.out.println("Class A - Constructor");
	}

	@Test(groups={"smoke","regression"}, dependsOnMethods={"Ball"}, successPercentage=90)
	public void Apple() {
		System.out.println("Class A - Method Apple");
	}

	@Test(groups="regression", dependsOnMethods="Ant")
	public void Ball() {
		System.out.println("Class A - Method Ball");
	}

	@Test(groups="sanity", priority=-1)
	public void Ant() {
		System.out.println("Class A - Method Ant");
	}
}
