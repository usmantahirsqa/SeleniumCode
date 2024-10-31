package TestNG.Lecture8;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
		@Test 
		@Parameters({"name"})
		public void GClass4(String Name) {
		System.out.println(Name);
		}
		@Test @Parameters({"url"})
		public void GClass2(String URL) {
		System.out.println(URL);
		
		}
		@Test @Parameters({"a","b"})
		public void GFunc1(int a, int b) {
			int c = a + b;
			System.out.println(c);
		}
		@Test @Parameters({"a","b"})
		public void GFunc3(float z, float j) {
			System.out.println(z + " how are you " + j);
		}
}
