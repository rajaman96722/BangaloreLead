package practice.basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Swiggy {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	   
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.swiggy.com/instamart/");
		
		 Thread.sleep(2000);
  	   TakesScreenshot ts = (TakesScreenshot)driver;
 		File source = ts.getScreenshotAs(OutputType.FILE);
 		File target = new File("C:\\Users\\AMAN RAJ\\eclipse-workspace-Aman_Raj\\tekpyramidmavenproject\\screenshot.png");
 		Files.copy(source, target);
  		
		
	List<WebElement> veg=driver.findElements(By.xpath("//div[text()='Fresh Vegetables']/ancestor::div[@class=\"rKVoK _1kbVF\"]/descendant::div[@class=\"_3aZ5w _1eWs7\"]"));
               for(WebElement veg1: veg) {
            	   
              
            	   System.out.println(veg1.getText());
               }
	}

}
