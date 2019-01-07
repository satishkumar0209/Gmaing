package gaming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmaillogin {

	
		
	public void gmail(WebDriver driver) throws InterruptedException
	{
		String url = "https://gaming.youtube.com/";

		driver.get(url);
		
		driver.findElement(By.xpath("//*[@class='style-scope ytg-user-avatar x-scope yt-icon-0']")).click();

		driver.findElement(By.xpath("//*[text()='Sign in']")).click();

		driver.findElement(By.id("identifierId")).sendKeys("peloteando2@gmail.com");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Enter your password']")));

		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("peloteando");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();
		
		Thread.sleep(4000);
		Dashboardpage.Live(driver).click();
		Thread.sleep(3000);
		Dashboardpage.Channels(driver).click();
		Thread.sleep(3000);
		Dashboardpage.Game(driver).click();
		Thread.sleep(3000);
		Dashboardpage.Home(driver).click();
		

	}

}
