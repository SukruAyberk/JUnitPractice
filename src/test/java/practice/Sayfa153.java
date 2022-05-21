package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Sayfa153 extends TestBase {

    @Test
    public void test() {
        // 1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");
        //2. “Our Products” butonuna basin
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[text()='Our Products']")).click();
        //3. “Cameras product”i tiklayin
        driver.findElement(By.xpath("//*[text()='Cameras']")).click();
        //4. Popup mesajini yazdirin
        WebElement popup = driver.findElement(By.xpath("//*[text()='Please Note: All orders must be over the value of £50, adding additional coupon codes to the basket are excluded from this offer. To receive 30% off please add the following code to the basket: ']"));
        System.out.println(popup.getText());
        //5. “close” butonuna basin
        driver.findElement(By.xpath("//*[text()='Close']")).click();
        //6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("(//a[@id='nav-title'])[1]")).click();
        //7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "http://webdriveruniversity.com/index.html";
        Assert.assertEquals(expectedURL, actualURL);
    }
}
