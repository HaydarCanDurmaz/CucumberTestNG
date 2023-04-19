package Pages.LoginPages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends Parent{
    public LoginPages(){PageFactory.initElements(GWD.getDriver(),this);}


    @FindBy(className = "icon-user")
    public WebElement userIcon;

    @FindBy(id = "user_login")
    public WebElement login;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(css = "[name='submit']")
    public WebElement loginButton;
}
