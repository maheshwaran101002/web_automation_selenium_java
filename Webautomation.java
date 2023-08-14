package webautomaation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webautomation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","ADD YOUR CHROME DRIVER PATH HERE");          //------ADD YOUR CHROME DRIVER PATH HERE
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
  int product = 0;
	while(product == 0){	
	////username
		
			WebElement username = driver.findElement(By.id("ap_email"));
			username.isDisplayed();
			username.isEnabled();
			username.sendKeys("ENTER YOUR AMAZON MAIL ID HERE");      //------Enter your amazon mail id here 
			
		////sign in
			
			WebElement signinButton = driver.findElement(By.id("continue"));
			signinButton.isDisplayed();
			signinButton.isEnabled();
			signinButton.click();
			
		////password
			
			WebElement password = driver.findElement(By.id("ap_password"));
			password.isDisplayed();
			password.isEnabled();
			password.sendKeys("ENTER YOUR AMAZON PASSWORD");       //------Enter your amazon password here
			
		////password sign in
			
					WebElement passsigninButton = driver.findElement(By.id("signInSubmit"));
					passsigninButton.isDisplayed();
					passsigninButton.isEnabled();
					passsigninButton.click();
					
				////searchbar
					
					WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
					searchbar.isDisplayed();
					searchbar.isEnabled();
					searchbar.sendKeys("parle Kismi Candy Bar - Elaichi, 14g Pouch");  //------ADD YOUR PRODUCT NAME WHICH YOU WANT TO SEARCH HERE
					
				////search
					
					WebElement search = driver.findElement(By.id("nav-search-submit-button"));
					search.isDisplayed();
					search.isEnabled();
					search.click();
					
				////selectproduct
					
			/*		WebElement selectproduct = driver.findElement(By.linkText("Parle Kismi Candy Bar - Elaichi, 14g Pouch"));       //------ADD YOUR PRODUCT LINKTEXT WHICH YOU WANT TO BUY
					selectproduct.isDisplayed();
					selectproduct.isEnabled();
					selectproduct.click();  */
					
				////addtocart
					
					WebElement addtocart = driver.findElement(By.id("a-autoid-1-announce"));
					addtocart.isDisplayed();
					addtocart.isEnabled();
					addtocart.click();
			
					
					
				////opencart
					
					WebElement opencart = driver.findElement(By.id("nav-cart-count-container"));
					opencart.isDisplayed();
					opencart.isEnabled();
					opencart.click();
					
					
				////proceedtobuy
					
					WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
					proceedtobuy.isDisplayed();
					proceedtobuy.isEnabled();
					proceedtobuy.click();
  }
}
}



	
