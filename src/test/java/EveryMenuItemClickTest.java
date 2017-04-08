import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.*;

public class EveryMenuItemClickTest extends BaseTest{

    @Test
    public void clickOnEveryItem(){
        loinPage.openLoginPage();
        loinPage.enterUserName("admin");
        loinPage.enterUserPass("admin");
        loinPage.clickLoginButton();
        assertTrue(loinPage.getUrl().contains("admin"));

        homePage.waitUntilLogoToBeVisible();
        List<WebElement> menuItems = homePage.getAllLeftMenuItems();

        //Method isn't native, other testers won't understand what I'm doing in it.
        for(int i = 0; i < menuItems.size(); i++){
            WebElement menuItem = homePage.getAllLeftMenuItems().get(i);
            menuItem.click();
            List<WebElement> subMenuItems = homePage.getAllLeftMenuISubitems();
            for(int j = 0; j < subMenuItems.size(); j++){
                WebElement subMenuItem = homePage.getAllLeftMenuISubitems().get(j);
                subMenuItem.click();
                assertTrue("Element by h1 not found", driver.findElement(By.cssSelector("h1")).isDisplayed());
            }
            assertTrue("Element by h1 not found", driver.findElement(By.cssSelector("h1")).isDisplayed());
        }
    }
}
