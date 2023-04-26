package newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class projecttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhushan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iphone13");
		
		WebElement buttonsearch = driver.findElement(By.id("nav-search-submit-button"));
		buttonsearch.click();
		
		driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Product/dp/B09G99CW2N/ref=sr_1_1_sspa?crid=2K75JGQKTZT0J&keywords=iphone%2B13&qid=1682244407&sprefix=i%2Caps%2C587&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		
		WebElement addTocart = driver.findElement(By.id("add-to-cart-button"));
		addTocart.click();
	
		
	}

}
