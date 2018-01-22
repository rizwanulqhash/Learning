package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\qa\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		String Parent_Window = driver.getWindowHandle();
//		driver.get("http://google.com");
//		System.out.println(driver.getTitle());
//		System.out.println("Window handle is: " + Parent_Window);
//driver.quit();
		
		int number = 823787384;
		int temp = 0;
		int rn = 0;
		
		while(number > 0){
			temp = number%10;
			rn = rn * 10 + temp;
			number = number/10;
			
		}
		
		System.out.println("Reversed Number is:" + rn);
	}

}
