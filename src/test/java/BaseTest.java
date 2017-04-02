import Pages.LoginPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class BaseTest {
    WebDriver driver;
    LoginPage loinPage;

    @BeforeClass
    public static void  setupClass() {
        ChromeDriverManager.getInstance().setup();
        InternetExplorerDriverManager.getInstance().arch32().setup();
        FirefoxDriverManager.getInstance().setup();
    }

    @Before
    public void setUp(){
        driver = new ChromeDriver();
//        driver = new InternetExplorerDriver();
//        driver = new FirefoxDriver();
        loinPage = new LoginPage(driver);
    }

    @After
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
