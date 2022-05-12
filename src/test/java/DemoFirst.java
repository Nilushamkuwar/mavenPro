import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoFirst
{
	
	

		public static void main(String[] args)
		{
			System.out.println("hello find the locater Demo Shop");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/login");
			driver.findElement(By.cssSelector("a[href='/register']")).click();
			driver.findElement(By.cssSelector("div.inputs input#gender-female")).click();
			driver.findElement(By.cssSelector("div.inputs input#FirstName")).sendKeys("Nilu");
			driver.findElement(By.cssSelector("div.inputs input#LastName")).sendKeys("Shamkuwar");
			driver.findElement(By.cssSelector("div.inputs input[name='Email']")).sendKeys("nilshamk4596098@gmial.com");
			driver.findElement(By.cssSelector("div.inputs input[name='Password']")).sendKeys("8390707538");
			driver.findElement(By.cssSelector("div.inputs input[name='ConfirmPassword']")).sendKeys("8390707538");
			driver.findElement(By.cssSelector("div.buttons input[name='register-button']")).click();
			driver.findElement(By.cssSelector("div.buttons input[class='button-1 register-continue-button']")).click();
			driver.findElement(By.cssSelector("a[href='/books']")).click();
			driver.findElement(By.cssSelector("div.buttons input[class='button-2 product-box-add-to-cart-button']")).click();
			driver.findElement(By.cssSelector("span[class='cart-qty']")).click();
			driver.findElement(By.cssSelector("div.terms-of-service input#termsofservice")).click();
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("button#checkout")).click();
			driver.findElement(By.cssSelector("div.inputs input[name='BillingNewAddress.Company']")).sendKeys("TATA MOTOR");
			WebElement dropdown=driver.findElement(By.cssSelector("div.inputs select[name='BillingNewAddress.CountryId']"));
			Select s=new Select(dropdown);
			s.selectByIndex(8);
			WebElement drop=driver.findElement(By.cssSelector("div.inputs select[name='BillingNewAddress.StateProvinceId']"));
			Select s1=new Select(drop);
			s1.selectByIndex(0);
			driver.findElement(By.cssSelector("div.inputs input[name='BillingNewAddress.City']")).sendKeys("Pune");
			driver.findElement(By.cssSelector("div.inputs input[name='BillingNewAddress.Address1']")).sendKeys("karve nagar");
			driver.findElement(By.cssSelector("div.inputs input[name='BillingNewAddress.Address2']")).sendKeys("Sahu colony lane no2 karve nagar");
			driver.findElement(By.cssSelector("div.inputs input[name='BillingNewAddress.ZipPostalCode']")).sendKeys("12354");
			driver.findElement(By.cssSelector("div.inputs input[name='BillingNewAddress.PhoneNumber']")).sendKeys("987564215");
			driver.findElement(By.cssSelector("div.inputs input[name='BillingNewAddress.FaxNumber']")).sendKeys("8579654");
			driver.findElement(By.cssSelector("div.buttons input[class='button-1 new-address-next-step-button']")).click();
			driver.findElement(By.cssSelector("p[class='selector'] input")).click();
			driver.findElement(By.cssSelector("div#shipping-buttons-container input[class='button-1 new-address-next-step-button'")).click();
			driver.findElement(By.cssSelector("div.payment-details input[name='paymentmethod']")).click();
			driver.findElement(By.cssSelector("div#payment-method-buttons-container input[class='button-1 payment-method-next-step-button']")).click();
			//driver.findElement(By.xpath("")).sendKeys("4567");
			driver.findElement(By.cssSelector("input[class='button-1 payment-info-next-step-button']")).click();
			
			driver.findElement(By.cssSelector("div#checkout-step-confirm-order")).click();
			driver.findElement(By.cssSelector("div#confirm-order-buttons-container input")).click();
			WebElement order=driver.findElement(By.cssSelector("div.title strong"));
			String con=order.getText();
			System.out.println(con);
			WebElement code=driver.findElement(By.cssSelector("ul.details li"));
			String co=code.getText();
			System.out.println(co);
			
			
			
			
			
			
			

		}

	}



