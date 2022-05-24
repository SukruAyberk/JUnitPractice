package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Q07_DropDown extends TestBase {


    @Test
    public void test() {
        // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        //-->Task1 Find Dropdown on Multi Selection
        WebElement multiSelectionElementi = driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
        Select select = new Select(multiSelectionElementi);
        //-->Task2 Find  all Dropdown Elements on page
        //-->Task3 printout DropDown Elements' number
        //-->Task4 choose dropdown elements and printout dropdown elements' name  until choise 6
    }
}
