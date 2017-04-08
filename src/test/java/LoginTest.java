import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest extends BaseTest{
    @Test
    public void testValidSignIn(){
        loinPage.openLoginPage();
        loinPage.enterUserName("admin");
        loinPage.enterUserPass("admin");
        loinPage.clickLoginButton();
        assertTrue(loinPage.getUrl().contains("admin"));
    }
}
