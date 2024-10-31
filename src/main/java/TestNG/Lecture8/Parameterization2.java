package TestNG.Lecture8;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization2 {
@Test @Parameters({"url"})
public void URLName(String URL) {
	System.out.println(URL);
}
}
