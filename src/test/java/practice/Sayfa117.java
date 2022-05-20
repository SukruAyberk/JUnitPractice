package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Sayfa117 extends TestBase {

    @Test
    public void test() {
        // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        // 2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
        System.out.println("iFrame sayısı: " + iframeList.size());
        // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
        // 5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        driver.switchTo().frame(iframeList.get(1));

    }
}
