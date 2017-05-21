package testNGpractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassE extends CommonClass{
	@Parameters({"text"})
	@Test
	public void f(String text1) {
		System.out.println("Class E");
		System.out.println("Parameter value: "+text1);
	}


	@Test
	@Parameters({"text"})
	public void f1(@Optional ("optional text") String text1) {
		System.out.println("Class E");
		System.out.println("Parameter value: "+text1);
	}

	@Test(dataProvider="source")
	public void f2(String name) {
		System.out.println("Class E");
		System.out.println("Data Provider Value: "+name);
	}
}
