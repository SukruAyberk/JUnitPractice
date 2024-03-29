package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Sayfa135 extends TestBase {

    @Test
    public void test() {

        // 1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        // 2- Hover over Me First" kutusunun ustune gelin
        WebElement hoverText = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverText).perform();
        // 3- Link 1" e tiklayin
        WebElement link1 = driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"));
        actions.click(link1).perform();
        // 4- Popup mesajini yazdirin
        String alert1 = driver.switchTo().alert().getText();
        System.out.println(alert1);
        // 5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        // 6- “Click and hold" kutusuna basili tutun
        WebElement clickAndHold = driver.findElement(By.xpath("//div[@id='click-box']"));
        actions.clickAndHold(clickAndHold).perform();
        // 7-“Click and hold" kutusunda cikan yaziyi yazdirin
        String clickAndHoldTextMessage = clickAndHold.getText();
        System.out.println(clickAndHoldTextMessage);
        // 8- “Double click me" butonunu cift tiklayin
        WebElement doubleClick = driver.findElement(By.xpath("//h2"));
        actions.doubleClick(doubleClick).perform();

        //github bağlandı
    }

}
