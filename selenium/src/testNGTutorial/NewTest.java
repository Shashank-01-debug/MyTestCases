package testNGTutorial;

import org.testng.annotations.Test;

public class NewTest {
	@Test(groups={"smoke"})
  public void f() {
	  System.out.println("This is Method f");
  }
  
  //by using dependsOnMethods={"f"} method f will be executed first and then method b will be executed.
  
  @Test(dependsOnMethods={"f"})
  public void b() {
	  
	  System.out.println("This is Method b");
	  
  }
  
  
}
