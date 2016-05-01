import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UITestBase {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://107.170.49.86:8889/cirrus-1.0.0";
		//baseUrl = "http://innovation-idea-graz.cfapps.io/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSortItem() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.linkText("Innovation Item")).click();
		//Thread.sleep(2500);
		driver.findElement(By.linkText("Owner")).click();
		//Thread.sleep(2500);
		driver.findElement(By.linkText("Submission Date")).click();
		driver.findElement(By.linkText("Theme")).click();
		driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-up")).click();
		driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
		driver.findElement(By.xpath("//div[@id='albums']/div[3]/div/div[4]/div/div/div/a/span")).click();
		driver.findElement(By.cssSelector("div.dropdown.open > ul.dropdown-menu > li > a")).click();
		driver.findElement(By.id("releaseYear")).clear();
		driver.findElement(By.id("releaseYear")).sendKeys("4/30/2015");
		driver.findElement(By.xpath("//div[3]/button")).click();
	}

	@Test
	public void testAddItem() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.linkText("add an idea")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Authorization as a Service");
		driver.findElement(By.id("artist")).clear();
		driver.findElement(By.id("artist")).sendKeys("Patrick Graziosi");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("That guy in the picture loved it!");
		driver.findElement(By.id("releaseYear")).clear();
		driver.findElement(By.id("releaseYear")).sendKeys("4/30/2016");
		driver.findElement(By.id("genre")).clear();
		driver.findElement(By.id("genre")).sendKeys("Right Speed IT");
		driver.findElement(By.xpath("//div[3]/button")).click();
		//Thread.sleep(1000);
	}
	
	@Test
	public void testAddAndDeleteItem() throws Exception {
		driver.get(baseUrl + "/");
		// Idea 2
		driver.findElement(By.linkText("add an idea")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Test Idea 2");
		driver.findElement(By.id("artist")).clear();
		driver.findElement(By.id("artist")).sendKeys("Patrick Graziosi");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("Test Idea 2");
		driver.findElement(By.id("releaseYear")).clear();
		driver.findElement(By.id("releaseYear")).sendKeys("4/30/2016");
		driver.findElement(By.id("genre")).clear();
		driver.findElement(By.id("genre")).sendKeys("Cloud Ready");
		driver.findElement(By.xpath("//div[3]/button")).click();
		// Idea 3
		//Thread.sleep(1000);
		driver.findElement(By.linkText("add an idea")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Test Idea 3");
		driver.findElement(By.id("artist")).clear();
		driver.findElement(By.id("artist")).sendKeys("Patrick Graziosi");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("Test Idea 3");
		driver.findElement(By.id("releaseYear")).clear();
		driver.findElement(By.id("releaseYear")).sendKeys("4/30/2016");
		driver.findElement(By.id("genre")).clear();
		driver.findElement(By.id("genre")).sendKeys("Connected Workforce");
		driver.findElement(By.xpath("//div[3]/button")).click();
		//Thread.sleep(2500);
	    driver.findElement(By.xpath("//div[@id='albums']/div[3]/div/div[5]/div/div/div/a/span")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'delete')])[5]")).click();
	    //Thread.sleep(2500);
	    driver.findElement(By.xpath("//div[@id='albums']/div[3]/div/div[5]/div/div/div/a/span")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'delete')])[5]")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
