package StepDefinitions;

import Pages.LoginPages.LoginPages;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class _01_LoginSteps {
    LoginPages lp=new LoginPages();
    WebDriver driver= GWD.getDriver();
    @Given("^Navigate to website$")
    public void navigateToWebsite()
    {

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
    }


    @And("^Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterUsernameAsAndPasswordAs(String login1, String password1)
    {
        lp.login.sendKeys(login1);
        lp.password.sendKeys(password1);
    }

    @When("^click login button$")
    public void clickLoginButton()
    {
        lp.loginButton.click();
        //
        GWD.getDriver().navigate().back();
    }



    @Then("^Verify that you are logged in\\.$")
    public void verifyThatYouAreLoggedIn()
    {
        Assert.assertTrue(lp.userIcon.isEnabled());
    }


}
