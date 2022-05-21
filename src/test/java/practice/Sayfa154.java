package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class Sayfa154 extends TestBase {

    @Test
    public void test() {

        // 1."http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");
        String ilkSayfaWindowHandle = driver.getWindowHandle();
        String ilkSayfaURL = driver.getCurrentUrl();

        //2."Login Portal" a kadar asagi inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                perform();

        //3."Login Portal" a tiklayin
        WebElement loginPortal = driver.findElement(By.xpath("//*[text()='LOGIN PORTAL']"));
        loginPortal.click();

        //4.Diger window'a gecin
        String ikinciSayfaWindowHandle = "";
        Set<String> windowHandleSeti = driver.getWindowHandles();
        for (String i : windowHandleSeti) {
            if (!i.equals(ilkSayfaWindowHandle)){
                ikinciSayfaWindowHandle = i;
            }
        }
        driver.switchTo().window(ikinciSayfaWindowHandle);

        //5."username" ve "password" kutularina deger yazdirin
        WebElement username = driver.findElement(By.xpath("//input[@id='text']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        //6."login" butonuna basin
        driver.findElement(By.id("login-button")).click();

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        String expectedText = "validation failed";
        String actualText = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedText, actualText);

        //8.Ok diyerek Popup'i kapatin
        driver.switchTo().alert().accept();

        //9.Ilk sayfaya geri donun
        driver.switchTo().window(ilkSayfaWindowHandle);

        //10.Ilk sayfaya donuldugunu test edin
        String ucuncuSayfaWindowHandle = driver.getWindowHandle();
        Assert.assertEquals(ilkSayfaWindowHandle, ucuncuSayfaWindowHandle);

    }

}
