import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DataPicker {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.findmyfare.com/");

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scroll(0,1000)");
        Thread.sleep(1000);

        String year = "2024";
        String month = "June";
        String date= "10";

        //open the date picker
        driver.findElement(By.xpath("//input[@id='departure_date_0']")).click();


        while (true){
            String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")).getText();
            String arr[]=monthyear.split(" ");
            String mnth = arr[0];
            String yr=arr[1];

            if (mnth.equals(month) && yr.equals(year))
                break;
            else
                driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//span[@class='ui-icon ui-icon-circle-triangle-e'][normalize-space()='Next']")).click();
        }

        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar']//td"));

        for (WebElement ele:allDates){
            String dt = ele.getText();

            if (dt.equals(date)){
                ele.click();
                break;
            }
        }

    }

}
