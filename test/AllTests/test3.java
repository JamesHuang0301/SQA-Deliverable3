package AllTests;

import com.google.common.base.Predicate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Jameshuang on 10/20/16.
 */
public class test3 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("http://store.demoqa.com/");
    }

    /**
     * Search any words
     * There will be no result
     */

    @Test
    public void searchanywords() {
        driver.findElement(By.className("search")).sendKeys("any words");
        driver.findElement(By.className("search")).sendKeys(Keys.ENTER);
        wait.until((Predicate<WebDriver>) d -> {
            try {
                return d.findElement(By.id("content")).isDisplayed();
            } catch (Exception e) {
                return false;
            }
        });
        String response = driver.findElement(By.id("content")).getText();
        assertEquals(response, "Sorry, but nothing matched your search criteria. Please try again with some different keywords.");
    }

    /**
     * Search iphone
     * There will be 5 results
     */

    @Test
    public void searchiphone() {
        driver.findElement(By.className("search")).sendKeys("iphone");
        driver.findElement(By.className("search")).sendKeys(Keys.ENTER);
        wait.until((Predicate<WebDriver>) d -> {
            try {
                return d.findElement(By.id("grid_view_products_page_container")).isDisplayed();
            } catch (Exception e) {
                return false;
            }
        });
        List<WebElement> alldevices;
        alldevices =
                driver.findElement(By.id("grid_view_products_page_container")).
                        findElements(By.className("grid_product_info"));
        for (WebElement option : alldevices) {
            option.findElement(By.tagName("a"));
        }
        assertTrue(alldevices.size() == 5);
    }

    /**
     * Search iphone
     * There will be one more results
     */

    @Test
    public void searchiphone2() {
        driver.findElement(By.className("search")).sendKeys("iphone");
        driver.findElement(By.className("search")).sendKeys(Keys.ENTER);
        wait.until((Predicate<WebDriver>) d -> {
            try {
                return d.findElement(By.id("grid_view_products_page_container")).isDisplayed();
            } catch (Exception e) {
                return false;
            }
        });
        List<WebElement> alldevices;
        alldevices =
                driver.findElement(By.id("grid_view_products_page_container")).
                        findElements(By.className("grid_product_info"));
        for (WebElement option : alldevices) {
            option.findElement(By.tagName("a"));
        }
        assertTrue(alldevices.size() > 0);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
