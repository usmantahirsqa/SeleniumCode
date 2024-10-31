package TestNG.Lecture8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Reporting {

	@Test
	public void getData() {
		WebDriver driver;
		System.setProperty("Webdriver.gecko.driver", "D:\\Muhammad Usman Tahir\\Software Quality Assurance Engineer\\SQA Types\\Test Automation\\Automation Testing Tools\\Web Automation Tesitng\\Selenium\\Selenium Course\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement email;
	email=driver.findElement(By.id("email"));
	email.sendKeys("itsusmantahir1999@gmail.com");

	WebElement passwo;
	passwo= driver.findElement(By.id("pass"));
	passwo.sendKeys("RealChamp09");

	WebElement button;
	button = driver.findElement(By.name("login"));
	button.click();
	}
}
