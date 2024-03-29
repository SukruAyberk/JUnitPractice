package practice;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Q08_ExplicitlyWait extends TestBase {

/*
    //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
    //maximize the window
    //click on action dialog button
    //if need use explicitly wait
    //click on the ok button
    //accept the alert message
 */

    @Test
    public void name() {
        driver.get("https://www.jqueryscript.net/demo/bootstrap-alert-box/");
        driver.findElement(By.xpath("//button[@id='action']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='dialog-mycodemyway-action']")));
        //messageElement.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='dialog-mycodemyway-action']"))).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}


