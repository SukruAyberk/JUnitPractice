package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class Sayfa133 extends TestBase {

    @Test
    public void test() {

        // 2- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        // 3- Arama kutusuna actions method’larine kullanarak
        // samsung A71 yazdirin ve Enter’a basarak arama
        // yaptirin
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.click(searchBox).sendKeys("samsung A71" + Keys.ENTER).perform();
        // 4- aramanin gerceklestigini test edin
        WebElement resultText = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(resultText.isDisplayed());

    }

}
