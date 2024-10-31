package TestNG.Lecture8;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PrioritizeClass4 {
	//@Test(priority=13)
	public void GClass4() {
	System.out.println("Prioritize Function 13");
	}
	//@Test(priority=14)

	public void GClass2() {
	System.out.println("Prioritize Function 14");
	}

//	@Test(priority=15)
	public void GFunc1() {
		System.out.println("PrioritizeFunction 15");
	}
//	@Test(priority=16)
	public void GFunc3() {
		System.out.println("PrioritizeFunction 16");
	}
}
