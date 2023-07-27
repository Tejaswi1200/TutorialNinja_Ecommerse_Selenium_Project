package tutorialsninja;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tutorials_ninja {

	public static void main(String[] args) throws InterruptedException {
		Select s;
		System.setProperty("webdriver.chrome.driver", "D:\\Edubridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//url
		driver.get("https://tutorialsninja.com/demo/");
		

		//My Account
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//Login
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		//MouseHover
				Actions a = new Actions(driver);
				
				//step 2: create object of list with Web Element
				List<WebElement>ls=driver.findElements(By.xpath("/html/body/div[2]/div/aside/div/a"));
			
				
				//step 3: Store size of List
				int size=ls.size();
				System.out.println("No of webElements: "+size);
				
				
				//Step 4: For loop
				for(int i=1; i<=size;i++)
				{
					//wait
					Thread.sleep(2000);
					
					//Display WebElements Name
					System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a["+i+"]")).getText());
					
					//Perform Mouse Hover
					a.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a["+i+"]"))).click().perform();
					
				}
				
		//Register
		driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[2]")).click();
		Thread.sleep(2000);
		
		//first name
		driver.findElement(By.id("input-firstname")).sendKeys("Samwidha");
		Thread.sleep(2000);
		
		//lastname
		driver.findElement(By.id("input-lastname")).sendKeys("Kandi");
		Thread.sleep(2000);
		
		//Email
		driver.findElement(By.id("input-email")).sendKeys("samwi@gmail.com");
		Thread.sleep(2000);
		
		//Telephone
		driver.findElement(By.id("input-telephone")).sendKeys("9676476947");
		Thread.sleep(2000);
		
		//Password
		driver.findElement(By.id("input-password")).sendKeys("samwi@1200");
		Thread.sleep(2000);
		
		//Confirm Password
		driver.findElement(By.id("input-confirm")).sendKeys("samwi@1200");
		Thread.sleep(2000);
		
		//Checkbox
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
		Thread.sleep(2000);
		
		//Continue
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
		Thread.sleep(2000);
		
		
		//Login
		driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[1]")).click();
		Thread.sleep(2000);
		
		//Email
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("asamwi1200@gmail.com");
		Thread.sleep(2000);
		//Password
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("kandi@1200");
		Thread.sleep(2000);
		
		//login
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(2000);
		
		//MouseHover
		Actions a1 = new Actions(driver);
		
		//step 2: create object of list with Web Element
		List<WebElement>ls1=driver.findElements(By.xpath("/html/body/div[1]/nav/div[2]/ul/li"));
	
		
		//step 3: Store size of List
		int size1=ls1.size();
		System.out.println("No of webElements: "+size1);
		
		
		//Step 4: For loop
		for(int i=1; i<=size1;i++)
		{
			//wait
			Thread.sleep(2000);
			
			//Display WebElements Name
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li["+i+"]")).getText());
			
			//Perform Mouse Hover
			a1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li["+i+"]"))).perform();
			
		}
		

		
		//Home Button
		driver.findElement(By.cssSelector("a[href='https://tutorialsninja.com/demo/index.php?route=common/home']")).click();
		Thread.sleep(2000);
		
		//Scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]"));
		js.executeScript("arguments[0].scrollIntoView", scroll);
		Thread.sleep(3000);
		//Scroll to top
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Search Bar
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Apple Cinema 30\"");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		Thread.sleep(2000);
		

		//scroll down
		WebElement scroll1=driver.findElement(By.xpath("/html/body/footer"));
		js.executeScript("arguments[0].scrollIntoView", scroll1);
		Thread.sleep(3000);
		
		
		//Select item
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		
		//View Product
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[1]/a/img")).click();
		Thread.sleep(2000);
		
		//Side button 
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		
		//Close button
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		
		//Scroll down
		WebElement scroll2=driver.findElement(By.xpath("//*[@id=\"tab-description\"]/h3[1]"));
		js.executeScript("arguments[0].scrollIntoView", scroll2);
		Thread.sleep(3000);
		
		
		WebElement scroll3=driver.findElement(By.xpath("//*[@id=\"tab-description\"]/p[7]/b"));
		js.executeScript("arguments[0].scrollIntoView", scroll3);
		Thread.sleep(3000);
		
		
		WebElement scroll4=driver.findElement(By.xpath("//*[@id=\"tab-description\"]/p[15]/b"));
		js.executeScript("arguments[0].scrollIntoView", scroll4);
		Thread.sleep(3000);
		
		WebElement scroll5=driver.findElement(By.xpath("//*[@id=\"tab-description\"]/p[21]"));
		js.executeScript("arguments[0].scrollIntoView", scroll5);
		Thread.sleep(3000);
		WebElement scroll6=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
		js.executeScript("arguments[0].scrollIntoView", scroll6);
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Scroll to top
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Specification
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")).click();
		Thread.sleep(2000);
		
		//Radio
		driver.findElement(By.xpath("//*[@id=\"input-option218\"]/div[2]/label/input")).click();
		Thread.sleep(2000);
		
		//Check box1
		driver.findElement(By.xpath("//*[@id=\"input-option223\"]/div[2]/label/input")).click();
		Thread.sleep(2000);
		//Check box2
		driver.findElement(By.xpath("//*[@id=\"input-option223\"]/div[2]/label/input")).click();
		Thread.sleep(2000);
		
		//Text
		driver.findElement(By.id("input-option208")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("input-option208")).sendKeys("Mac");
		Thread.sleep(2000);
		
		//Select 
		s = new Select(driver.findElement(By.id("input-option217")));
		s.selectByValue("3");
		Thread.sleep(2000);
		//Text Area
		driver.findElement(By.id("input-option209")).sendKeys("Please maintain quality of package");
		Thread.sleep(2000);

		
		//Date
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[7]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/thead/tr[1]/th[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/thead/tr/th[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/table/thead/tr/th[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/table/tbody/tr/td/span[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr/td/span[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[2]/td[1]")).click();
		Thread.sleep(2000);
		
		
		//Time
		driver.findElement(By.xpath("//*[@id=\"product\"]/div[8]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/table/tbody/tr[3]/td[1]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/table/tbody/tr[2]/td[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body")).click();
		
		//Date and Time
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[9]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/div/div[2]/table/thead/tr/th[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/div/div[3]/table/thead/tr/th[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/div/div[3]/table/tbody/tr/td/span[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/div/div[2]/table/tbody/tr/td/span[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/div/div[1]/table/tbody/tr[2]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[3]/div/div[2]/table/tbody/tr[6]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[3]/div/div[3]/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body")).click();
		//Qty
		driver.findElement(By.id("input-quantity")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("input-quantity")).sendKeys("1");
		//Add to cart
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[10]/button")).click();
		Thread.sleep(2000);
		
		//cart
		driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[1]")).click();
		Thread.sleep(2000);
		
		
		//Estimate shipping and Taxes
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		
		s = new Select(driver.findElement(By.id("input-country")));
		s.selectByValue("103");
		Thread.sleep(2000);
		s = new Select(driver.findElement(By.id("input-zone")));
		s.selectByValue("1591");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-postcode")).sendKeys("159125");
		Thread.sleep(2000);
		
		//Get quotes
		driver.findElement(By.xpath("//*[@id=\"button-quote\"]")).click();
		Thread.sleep(2000);
		
		//Flat rate
		driver.findElement(By.xpath("//*[@id=\"modal-shipping\"]/div/div/div[2]/div/label/input")).click();
		Thread.sleep(2000);
		
		//Apply shipping
		driver.findElement(By.id("button-shipping")).click();
		Thread.sleep(2000);
		
		//check out
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		Thread.sleep(2000);
		
		//Account
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		Thread.sleep(2000);
		
		//Logout
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		
		//close browser
		driver.quit();
		
		
	}

}
