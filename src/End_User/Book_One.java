package End_User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_One {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://WWW.Booking.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)");
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[2]/div/div/span")).click();
//		 Thread.sleep(3000);
	}

}
