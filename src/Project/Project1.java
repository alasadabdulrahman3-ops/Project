package Project;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project1 {

	ChromeDriver driver ;
	String myWebSite = "https://www.saucedemo.com/";
	@BeforeTest
	public void mySetup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get(myWebSite);
			}
	@Test (priority = 1)
	public void login () {
	WebElement usernames  = driver.findElement(By.id("user-name"))	;
	WebElement Password = driver.findElement(By.id("password"))	;
	WebElement login = driver.findElement(By.id("login-button"));
	usernames.sendKeys("standard_user");
	Password.sendKeys("secret_sauce");
	login.click();	
	}
	@Test (priority = 2 , enabled = false)
	public void AddTOCart () {
		WebElement AddTOCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddTOCart.click();
	}
	@Test (priority = 3 , enabled = false  )
	public void AddTOCart1 () {
		WebElement SauceLabsBikeLight = driver.findElement(By.className("inventory_item_name"));
		SauceLabsBikeLight.click();
	WebElement Add = driver.findElement(By.id("add-to-cart"));
	Add.click();
	WebElement basket = driver.findElement(By.className("shopping_cart_link"));
	basket.click();

	WebElement remove = driver.findElement(By.id("remove-sauce-labs-backpack"));
	remove.click();
	WebElement conting = driver.findElement(By.id("continue-shopping"));
	conting.click();
	}
	@Test (priority = 4 )
	public void testProductSortDropdown() throws InterruptedException {
		
		  // تحديد القائمة
	    WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));

	    // إنشاء كائن من Select
	    Select select = new Select(sortDropdown);	
	    // نحفظ الخيارات في list
	    String[] options = {"az", "za", "lohi", "hilo"};
	    // نمر عليهم واحد واحد
	    for (String option : options) {
	        select.selectByValue(option);
	        Thread.sleep(1000); // بس عشان نشوف التغيير بصرياً
	        System.out.println("za  :"   + option);}}
		
	@Test(priority = 5)
	public void button () {


	}

	}
