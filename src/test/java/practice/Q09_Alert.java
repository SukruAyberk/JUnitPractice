package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q09_Alert extends TestBase {

    @Test
    public void name() {

        //    go to url :http://demo.automationtesting.in/Alerts.html
        driver.get("http://demo.automationtesting.in/Alerts.html");

        //    click  "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

        //    accept Alert(I am an alert box!) and print alert on console
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        //    cancel Alert  (Press a Button !)
        driver.switchTo().alert().dismiss();

        //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

        //    and then sendKeys 'TechProEducation' (Please enter your name)
        driver.switchTo().alert().sendKeys("TechProEducation Ayberk");
        driver.switchTo().alert().accept();
        //    finally print on console this message "Hello TechproEducation How are you today"
        System.out.println(driver.findElement(By.xpath("//p[@id='demo1']")).getText());


    }
}
