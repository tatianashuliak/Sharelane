import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SharelaneRegistrationTest {
    WebDriver driver;

    @Test
    public void fiveDigitsZipCodeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // Open register page https://www.sharelane.com/cgi-bin/register.py
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        // Input five digits to zip code field
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        // Click Continue button
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        // Check Register button
        WebElement registerButton = driver.findElement(By.cssSelector("[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed(), "Register button isn't displayed");
    }

    @Test
    public void fourDigitsZipCodeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // Open register page https://www.sharelane.com/cgi-bin/register.py
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        // Input four digits to zip code field
        driver.findElement(By.name("zip_code")).sendKeys("1234");
        //Click Continue button
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        //Check Register button
        WebElement registerButton = driver.findElement(By.cssSelector("[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed(), "Register button isn't displayed");
    }

    @Test
    public void sixDigitsZipCodeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // Open register page https://www.sharelane.com/cgi-bin/register.py
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        // Input six digits to zip code field
        driver.findElement(By.name("zip_code")).sendKeys("123456");
        //Click Continue button
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        //check Register button
        WebElement registerButton = driver.findElement(By.cssSelector("[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed(), "Register button isn`t displayed");
    }

    @Test
    public void SignUpFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // Open register page https://www.sharelane.com/cgi-bin/register.py
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        // Input five digits to zip code field
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        //Click Continue button
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        // Input name to First Name field
        driver.findElement(By.name("first_name")).sendKeys("Tatiana");
        // Input name to Last Name field
        driver.findElement(By.name("last_name")).sendKeys("Shuliak");
        // Input email to Email field
        driver.findElement(By.name("email")).sendKeys("test@mail.ru");
        // Input password to Password field
        driver.findElement(By.name("password1")).sendKeys("12345");
        // Input password to Confirm password field
        driver.findElement(By.name("password2")).sendKeys("12345");
        //Click Register button
        driver.findElement(By.cssSelector("[value='Register']")).click();
        // Check message "Account is created!"
        Assert.assertTrue(driver.findElement(By.className("confirmation_message")).isDisplayed(), "Confirmation message isn't displayed");
    }
}
