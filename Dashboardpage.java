package gaming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboardpage {
	public static WebElement Home(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[@class='tab-content style-scope paper-tab'])[2]"));
	}
	public static WebElement Live(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[@class='style-scope ytg-single-column-browse-results-renderer x-scope paper-tab-0'])[1]"));
	}
	public static WebElement Game(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[@class='style-scope ytg-single-column-browse-results-renderer x-scope paper-tab-0'])[2]"));
	}
	public static WebElement Channels(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()='Channels']"));
	}
	

}
