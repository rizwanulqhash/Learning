package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/qa/ChromeDriver/chromedriver.exe");
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
