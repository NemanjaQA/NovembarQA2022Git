package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public void thisMethodIsNotDoingAnything(){
        //Samo da vas poremetim
    }
}
