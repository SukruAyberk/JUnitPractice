package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class Q10_Iframe extends TestBase {

    @Test
    public void name() {

        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        // web sitesini maximize yapin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        // ikinci emojiye tıklayın
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();
        // tüm ikinci emoji öğelerini tıklayın
        driver.findElement(By.xpath("//img[@alt='\uD83D\uDC00']")).click();
        driver.findElement(By.xpath("//img[@alt='\uD83D\uDC12']")).click();
        driver.findElement(By.xpath("//img[@alt='\uD83D\uDC14']")).click();
        driver.findElement(By.xpath("//img[@alt='\uD83D\uDC15']")).click();
        // parent iframe e geri donun
        driver.switchTo().defaultContent();
        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        WebElement form = driver.findElement(By.xpath("//input[@id='text']"));
        Actions actions = new Actions(driver);
        actions.click(form).
                sendKeys("sdfhafdha").
                sendKeys(Keys.TAB).
                sendKeys("smile").
                sendKeys(Keys.TAB).
                sendKeys("maymun").
                sendKeys(Keys.TAB).
                sendKeys("muz").
                sendKeys(Keys.TAB).
                sendKeys("sallanmak").
                sendKeys(Keys.TAB).
                sendKeys("orman").
                sendKeys(Keys.TAB).
                sendKeys("ağaç").
                sendKeys(Keys.TAB).
                sendKeys("apes together strong").
                sendKeys(Keys.TAB).
                sendKeys("maymunlar cehennemi bayrağı").
                sendKeys(Keys.TAB).
                sendKeys("maymunlar cehennemi bayrağı").
                sendKeys(Keys.TAB).
                sendKeys("maymunlar cehennemi bayrağı").
                perform();
        //  apply button a basin
        driver.findElement(By.xpath("//button[@id='send']")).click();
    }
}
