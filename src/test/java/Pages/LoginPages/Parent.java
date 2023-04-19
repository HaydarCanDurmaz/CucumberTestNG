package Pages.LoginPages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void sendKeysFunctions(WebElement element,String yazi)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        element.click();
    }
    public void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }
    public void verifyContainsTextFuncion(WebElement element,String value)
    {
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"bo such TEXT");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }
    public void  scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",element);
    }
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

