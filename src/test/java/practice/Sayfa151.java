package practice;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Sayfa151 extends TestBase {

    @Test
    public void test() {
        // 1. "https://facebook.com" Adresine gidin
        driver.get("https://facebook.com");
        //2. “create new account” butonuna basin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        //3. “firstName” giris kutusuna bir isim yazin
        Actions actions = new Actions(driver);
        Faker faker = new Faker();
        String fakeMail = faker.internet().emailAddress();
        String fakePass = faker.internet().password();
        WebElement nameBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        actions.click(nameBox).
                sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(fakeMail).
                sendKeys(Keys.TAB).
                sendKeys(fakePass).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("15").
                sendKeys(Keys.TAB).
                sendKeys("T").
                sendKeys(Keys.TAB).
                sendKeys("1999").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_RIGHT).
                perform();

        WebElement erkek = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
        erkek.click();
        WebElement otherOptionIsChecked = driver.findElement(By.xpath("(//label[@class='_58mt'])[3]"));
        Assert.assertTrue(erkek.isSelected());
        Assert.assertFalse(otherOptionIsChecked.isSelected());


        //12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        //13. Sayfayi kapatin
    }

}
