import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
        InternetExplorerDriverManager.getInstance().arch32().setup();
        FirefoxDriverManager.getInstance().setup();
    }

    @Before
    public void start() {
        driver = new ChromeDriver();
//        driver = new InternetExplorerDriver();
//        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void MyFirstTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(ExpectedConditions.titleIs("webdriver - Пошук Google"));
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}