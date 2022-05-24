package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Sayfa171 extends TestBase {

    @Test
    public void webTablesTest() {

        // Bir Class olusturun D19_WebtablesHomework
        // 1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");
        // 2. Headers da bulunan department isimlerini yazdirin
        List<WebElement> headers = driver.findElements(By.xpath("//div[@class='rt-tr']//div[@role='columnheader']"));
        int departmentNo = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equalsIgnoreCase("department")) {
                departmentNo = i;
            }
        }

        List<WebElement> departmentValueList = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[" + (departmentNo + 1) + "]"));
        for (int i = 0; i < departmentValueList.size(); i++) {
            if (!departmentValueList.get(i).getText().equals(" ")) {
                System.out.println(departmentValueList.get(i).getText());
            }
        }

        // 3. sutunun basligini yazdirin
        System.out.println(headers.get(departmentNo).getText());

        // 4. Tablodaki tum datalari yazdirin
        WebElement allData = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        System.out.println(allData.getText());


        // 5. Tabloda kac cell (data) oldugunu yazdirin
        List<WebElement> cells = driver.findElements(By.xpath("//div[@class='rt-td']"));
        System.out.println(cells.size());

        // 6. Tablodaki satir sayisini yazdirin
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println(rows.size());

        // 7. Tablodaki sutun sayisini yazdirin
        System.out.println(headers.size());

        // 8. Tablodaki 3.kolonu yazdirin
        int ageNo = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equalsIgnoreCase("age")) {
                ageNo = i;
            }
        }

        List<WebElement> ageValueList = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[" + (ageNo + 1) + "]"));
        for (int i = 0; i < ageValueList.size(); i++) {
            if (!ageValueList.get(i).getText().equals(" ")) {
                System.out.println(ageValueList.get(i).getText());
            }
        }

        // 9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        int kierraIndex = 0;
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i).getText().contains("Kierra")) {
                kierraIndex = i;
            }
        }

        int salaryNo = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equalsIgnoreCase("salary")) {
                salaryNo = i;
            }
        }

        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tr-group'][" + (kierraIndex + 1) + "]//div[@class='rt-td'][" + (salaryNo + 1) + "]")).getText());

        // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        satirSutun();


    }

    private void satirSutun() {
        int satirNo = 1;
        int sutunNo = 1;

        WebElement satirSutun = driver.findElement(By.xpath("//div[@class='rt-tr-group'][" + satirNo + "]//div[@class='rt-td'][" + sutunNo + "]"));
        System.out.println(satirSutun.getText());

    }
}
