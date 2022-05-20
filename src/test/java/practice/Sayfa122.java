package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.List;

public class Sayfa122 extends TestBase {

    @Test
    public void test() {

        // ● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com/");
        // ● Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonWindowHandle = driver.getWindowHandle();
        // ● Sayfa title’nin “Amazon” icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        // ● Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.techproeducation.com/");
        String techProWindowHandle = driver.getWindowHandle();
        // ● Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
        // yukardaki yanlış olduğu için "Techpro Education" ile test edicez
        System.out.println(driver.getTitle()); // Techpro Education | Online It Courses & Bootcamps
        Assert.assertTrue(driver.getTitle().contains("Techpro Education"));
        // ● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com/");
        String walmartWindowHandle = driver.getWindowHandle();
        // ● Sayfa title’nin “Walmart” icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Walmart"));
        // ● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(amazonWindowHandle);
        String expectedURL = "https://www.amazon.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}
