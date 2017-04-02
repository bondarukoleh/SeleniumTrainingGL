package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void openLoginHomePage() {
        driver.get("http://localhost/litecart/admin/");
        wait.until(ExpectedConditions.titleIs("My Store"));
    }

    public void enterUserName(String name) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
    }

    public void enterUserPass(String pass) {
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector("button[name='login']")).click();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
