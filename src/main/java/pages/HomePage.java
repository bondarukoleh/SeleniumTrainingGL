package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    public void waitUntilLogoToBeVisible(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div[class=logotype]"))));
    }

    public List<WebElement> getAllLeftMenuItems(){
        List<WebElement> listOfItems = driver.findElements(By.cssSelector("#app-"));
        return listOfItems;
    }

    public List<WebElement> getAllLeftMenuISubitems(){
        List<WebElement> listOfSubitems = driver.findElements(By.cssSelector("li[id^=doc-]"));
        return listOfSubitems;
    }
}
