package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void waitVisibility(By by){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public void clickElement(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public String readText(By elementBy){
            waitVisibility(elementBy);
            return driver.findElement(elementBy).getText();
    }
    public void writeText(By elementBy, String text){
            waitVisibility(elementBy);
            driver.findElement(elementBy).clear();
            driver.findElement(elementBy).sendKeys();
    }
    public void assertStringEquals(String actualText, String expectedText){
        Assert.assertEquals(actualText,expectedText);

    }
    public void thisMethodIsNotDoingAnything(){
        //Samo da vas poremetim
    }
}
