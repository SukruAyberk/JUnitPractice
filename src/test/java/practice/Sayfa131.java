package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class Sayfa131 extends TestBase {

    @Test
    public void test() {

        // 1- https://www.amazon.com/ adresine gidelim
        driver.get("https://www.amazon.com/");
        // 2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin mouse’u bu menunun ustune getirelim
        WebElement acoountMenu = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(acoountMenu).perform();
        // 3- “Create a list” butonuna basalim
        WebElement createAList = driver.findElement(By.xpath("//*[text()='Create a List']"));
        actions.click(createAList).perform();
        // 4- Acilan sayfada “Your Lists” yazisi oldugunu test edelim
        WebElement yourList = driver.findElement(By.xpath("//div[@role='heading']"));
        String expectedText = "Your Lists";
        String actualText = yourList.getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
