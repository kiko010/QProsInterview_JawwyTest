/**
 * 
 */
package JawwyUI;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kiko0
 *
 */
public class PricingTestNation {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Before
	public void setUp()
	{
		driver.get("https://subscribe.stctv.com/");
		driver.findElement(By.className("country-current")).click();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void uaePricingTest()
	{
		driver.findElement(By.id("ae-contry-lable")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-لايت']/b")).getText(),"5.4");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-الأساسية']/b")).getText(),"10.9");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-بريميوم']/b")).getText(),"16.3");
	}
	
	@Test
	public void tdPricingTest()
	{
		driver.findElement(By.id("td-contry-lable")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-لايت']/b")).getText(),"2.4");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-الأساسية']/b")).getText(),"4.8");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-بريميوم']/b")).getText(),"7.2");
	}
	
	@Test
	public void morPricingTest()
	{
		driver.findElement(By.id("ma-contry-flag")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-لايت']/b")).getText(),"2");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-الأساسية']/b")).getText(),"3.9");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='currency-بريميوم']/b")).getText(),"5.8");
	}

}
