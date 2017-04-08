package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver){
        super(driver);
    }

    public void openMainPage(){
        driver.get("http://localhost/litecart/en/login");
        wait.until(ExpectedConditions.titleIs("Online Store | My Store"));
    }

    public void clickOnFirstGood(){
        driver.findElement(By.cssSelector(
                "//div[@id='box-most-popular']//li[@class='product column shadow hover-light'][1]")).click();
    }


}
