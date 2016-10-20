package AllTests;

import com.google.common.base.Predicate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jameshuang on 10/20/16.
 */
public class test2 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("http://store.demoqa.com/products-page/your-account/");
    }

    /**
     * Login in with nothing
     * User will not be allowed to log in;
     */

    @Test
    public void nothing(){
        driver.findElement(By.id("login")).submit();
        wait.until((Predicate<WebDriver>) d -> {
            try {
                return d.findElement(By.tagName("Strong")).isDisplayed();
            } catch (Exception e) {
                return false;
            }
        });
        String response = driver.findElement(By.tagName("strong")).getText();
        assertEquals("ERROR", response);
    }

    /**
     * Login in with invalid password and valid username
     * User will not be allowed to log in;
     * return nothing
     */

    @Test
    public void invalidpass(){
        driver.findElement(By.name("log")).sendKeys("xhuang0301");
        driver.findElement(By.name("pwd")).sendKeys("123");
        driver.findElement(By.name("submit")).click();
        wait.until((Predicate<WebDriver>) d -> {
            try {
                return d.findElement(By.tagName("Strong")).isDisplayed();
            } catch (Exception e) {
                return false;
            }
        });
        String response  = driver.findElement(By.tagName("strong")).getText();
        assertEquals("ERROR", response);
    }

    /**
     * Login in with invalid username and valid password
     * User will not be allowed to log in;
     */

    @Test
    public void invaliduser(){
        driver.findElement(By.name("log")).sendKeys("xhuang");
        driver.findElement(By.name("pwd")).sendKeys("123456789@@@");
        driver.findElement(By.name("submit")).click();
        wait.until((Predicate<WebDriver>) d -> {
            try {
                return d.findElement(By.tagName("Strong")).isDisplayed();
            } catch (Exception e) {
                return false;
            }
        });
        String response  = driver.findElement(By.tagName("strong")).getText();
        assertEquals("ERROR", response);
    }

    @After
    public void teardown(){
        driver.quit();
    }

}
