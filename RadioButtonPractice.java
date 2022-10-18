package Day1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C://Users//18728//Downloads//chromedriver_win32 (3)//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
       driver.findElement(By.cssSelector("input[value=\"green\"]")).click();

      if (driver.findElement(By.cssSelector("input[value=\"green\"]")).isSelected()) {
	   System.out.println("Radio button selected");
      }
	
         else {
	   System.out.println("Radio button is not selected");
 }
	

      //click on every Radio button

     List<WebElement> RButtons = driver.findElements(By.cssSelector("input[name=\"color\"]"));
     
     for (int p=0; p < RButtons.size();p++) {
	     System.out.println(p);
	     Thread.sleep(1000);
	    if (!RButtons.get(p).isSelected()) {
	    RButtons.get(p).click();
     		
     			}
     		}
}
}



