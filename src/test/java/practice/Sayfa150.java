package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Sayfa150 extends TestBase {

    @Test
    public void test() {
        // 1. Bir class olusturun : EnableTest
        //2. Bir metod olusturun : isEnabled()
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Textbox’in etkin olmadigini(enabled) dogrulayın
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        //7. Textbox’in etkin oldugunu(enabled) dogrulayın.
    }

}
