package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethodAssignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//18728//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//get()
		driver.get("http://automationpractice.com/index.php");
		
		//sendKeys()
		//driver.findElement(By.id("search_query_top")).sendKeys("women dresses");
		//driver.findElement(By.className("search_query")).sendKeys("women dresses");
		//driver.findElement(By.cssSelector("input[id=\"search_query_top\"]")).sendKeys("women dresses");
		//driver.findElement(By.xpath("//input[@id=\"search_query_top\"]")).sendKeys("women dresses");
		
		//clear()
		//driver.findElement(By.id("search_query_top")).clear();
		
		//click()
		//driver.findElement(By.cssSelector("a[title=\"Contact Us\"]")).click();
		
		//getAttribute()
		//driver.findElement(By.cssSelector("a[title=\"T-shirts\"]")).getAttribute("title");
		
		//getText() 
		//String val = driver.findElement(By.id("search_query_top")).getText();
		//System.out.println(val);
		
		//gettagname()
		//String value = driver.findElement(By.cssSelector("[title=\"Contact Us\"]")).getTagName();
		//System.out.println(value);
		
		
		// isDisplayed()
		// boolean val1 = driver.findElement(By.className("sf-with-ul")).isDisplayed();
		//System.out.println(val1);
		
		// isEnabled()
	    //	boolean val2 = driver.findElement(By.cssSelector("[title=\"T-shirts\"]")).isEnabled();
		//System.out.println(val2);

		
		// isSelected()
		//	driver.findElement(By.cssSelector("a[id=\"index_\"]")).click();
		//	boolean val3 = driver.findElement(By.cssSelector("a[id=\"index\"]")).isSelected();
		//	System.out.println(val3);
		
		// getSize()
		
		//System.out.println(driver.findElement(By.cssSelector("a[title=\"Dresses\"]")).getSize());
				
		//getLocation()
		//System.out.println(driver.findElement(By.cssSelector("a[title=\\\"Dresses\\")).getLocation());
		
		
		// getCssValue()
		
		String val4 = driver.findElement(By.tagName("a")).getCssValue("Dresses");
		System.out.println(val4);
				
				
				
				
				driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
