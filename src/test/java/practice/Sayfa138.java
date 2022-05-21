package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseClass;

import java.util.List;

public class Sayfa138 extends TestBaseClass {

    // Test01 :
    //1- amazon gidin
    //2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
    //3- dropdown menude 28 eleman olduğunu doğrulayın
    //Test02
    //1- dropdown menuden elektronik bölümü seçin
    //2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
    //3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
    //4- ikinci ürüne relative locater kullanarak tıklayin
    //5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
    //Test03
    //1- yeni bir sekme açarak amazon anasayfaya gidin
    //2-dropdown’dan bebek bölümüne secin
    //3-bebek puset aratıp bulundan sonuç sayısını yazdırın
    //4-sonuç yazsının puset içerdiğini test edin
    //5-üçüncü ürüne relative locater kullanarak tıklayin
    //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
    //Test 4
    //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın

    @Test
    public void test01() {
        // Test01 :
        //1- amazon gidin
        //2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        //3- dropdown menude 28 eleman olduğunu doğrulayın
        driver.get("https://www.amazon.com/");
        WebElement dropDownMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropDownMenu);
        List<WebElement> optionList = select.getOptions();
        System.out.println(optionList);
        System.out.println(optionList.size());
        int expectedSize = 28;
        Assert.assertEquals(28, optionList.size());

    }

    @Test
    public void test02() {
        //Test02
        //1- dropdown menuden elektronik bölümü seçin
        //2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        //3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
        //4- ikinci ürüne relative locater kullanarak tıklayin
        //5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim

        driver.get("https://www.amazon.com/");
        WebElement dropDownMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropDownMenu);
        select.selectByVisibleText("Electronics");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" + Keys.ENTER);
        WebElement resultText = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(resultText.getText().contains("iphone"));
        driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).click();
        String urunTitle = driver.getTitle();
        String price = driver.findElement(By.xpath("")).getText();

    }

    @Test
    public void test03() {

    }

    @Test
    public void test04() {

    }

}
