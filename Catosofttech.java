package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Catosofttech {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.get("https://www.validlog.com/contact-us/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,350)", "");
         driver.findElement(By.xpath("//*[@id=\"form-field-name\"]")).sendKeys("Bindu");
         Thread.sleep(500);
         driver.findElement(By.xpath("//*[@id=\"form-field-phone\"]")).sendKeys("7892568453");
         Thread.sleep(500);
         driver.findElement(By.xpath("//*[@id=\"form-field-email\"]")).sendKeys("binduveeru25@gmail.com");
         Thread.sleep(500);
         driver.findElement(By.xpath("//*[@id=\"form-field-message\"]")).sendKeys("hi");
         Thread.sleep(500);
         driver.findElement(By.xpath("/html/body/div[2]/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/form/div/div[5]/button/span/span[2]")).click();
         
	}

}