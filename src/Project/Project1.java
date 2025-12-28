package Project;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project1 {

	ChromeDriver driver ;
	String myWebSite = "https://www.saucedemo.com/";
	String URL = "https://x.com/i/flow/signup";
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
	@Test (priority = 4 ,enabled = false )
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
	        System.out.println("az  :"   + option);}}
		
	
	@Test(priority = 5 , enabled = false)
	public void Addtwotems(){
		Random rand = new Random() ;
	int randomItem1 = rand.nextInt(6)	;
	int randomItem2;
	do {    
	    randomItem2 = rand.nextInt(6);}
	while(randomItem2 ==randomItem1 );
	List<WebElement> AddtoCartButtons = driver.findElements(By.className("btn_inventory"));
	AddtoCartButtons.get(randomItem1).click();
	AddtoCartButtons.get(randomItem2).click();
	}
	
@Test(priority = 6 , enabled = false)
public void Aaa1() {
	Random rand = new Random();
	int randomItem1 = rand.nextInt(6);
	int randomItem2;
	int randomItem3;
	do {
		randomItem2 = rand.nextInt(6);}
	while (randomItem2 == randomItem1);
	do {
	randomItem3 = rand.nextInt(6)	;	
	}
while(
		randomItem3 == 	randomItem1  || randomItem3 == randomItem2);
			
	List<WebElement> Add1 = driver.findElements(By.className("btn_small"));
	Add1.get(randomItem1).click();
	Add1.get(randomItem2).click();
	Add1.get(randomItem3).click();
}
@Test(priority = 7 , enabled = false)
public void Add2() {
Random rand = new Random();
int random1 = rand.nextInt(6);
int random2 ; 
int random3 ;
int random4;
do {random2 =  rand.nextInt(6);} while(random2 == random1);
do {random3 =  rand.nextInt(6);} while(random3 == random1 || random3 ==random2);	
do {random4 =  rand.nextInt(6);} while(random4 == random1 || random4 == random2 ||random4 ==random3);
List<WebElement> Add2 = driver.findElements(By.className("btn_inventory"));
Add2.get(random1).click();
Add2.get(random2).click();
Add2.get(random3).click();
Add2.get(random4).click();}

@Test(priority = 7)

public void Add3() throws InterruptedException {
Random 	Add = new Random();
int randomA1 = Add.nextInt(6);
int randomA2;
int randomA3;
int randomA4;
int randomA5;
do {randomA2 =  Add.nextInt(6);} while(randomA2 == randomA1);
do {randomA3 =  Add.nextInt(6);} while(randomA3 == randomA1 || randomA3 ==randomA2);
do {randomA4 =  Add.nextInt(6);} while(randomA4 == randomA1 || randomA4 ==randomA2 || randomA4== randomA3);
do {randomA5 =  Add.nextInt(6);} while(randomA5 == randomA1 || randomA5 ==randomA2 || randomA5== randomA3 ||randomA5 ==randomA4);
List<WebElement> Add3 = driver.findElements(By.className("btn_primary"));
Add3.get(randomA1).click();	
Add3.get(randomA2).click();	
Add3.get(randomA3).click();	
Add3.get(randomA4).click();	
Add3.get(randomA5).click();		
WebElement basket = driver.findElement(By.className("shopping_cart_link"));
basket.click();
Thread.sleep(2500); // بس عشان نشوف التغيير بصرياً
WebElement Checkout = driver.findElement(By.id("checkout"));
Checkout.click();
Thread.sleep(2500); // بس عشان نشوف التغيير بصرياً
WebElement firstName = driver.findElement(By.id("first-name"));
WebElement lastName = driver.findElement(By.id("last-name"));
WebElement postalCode = driver.findElement(By.id("postal-code"));
WebElement cancel = driver.findElement(By.id("continue"));
firstName.sendKeys("0");
lastName.sendKeys("1");
postalCode.sendKeys("2");
cancel.click();
Thread.sleep(2500);
WebElement finish = driver.findElement(By.id("finish"));
finish.click();
Thread.sleep(1000);
WebElement BackHome = driver.findElement(By.id("back-to-products"));
BackHome.click();
Thread.sleep(1000);
WebElement list = driver.findElement(By.className("bm-burger-button"));
list.click();
WebElement Logout = driver.findElement(By.id("logout_sidebar_link"));
Logout.click();
}
}



	
	
	
