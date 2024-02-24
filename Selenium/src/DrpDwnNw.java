import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DrpDwnNw {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seylan.lk/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);

        //Page Scroll
        JavascriptExecutor jse = (JavascriptExecutor)  driver;
        jse.executeScript("window.scroll(0,500)");
        Thread.sleep(2000);


        driver.findElement(By.xpath("//span[@id='select2-productCategory-container']")).click();
        List<WebElement> catgry = driver.findElements(By.xpath("//ul[@id='select2-productCategory-results']/li"));
        selectOptionsFrmDrpDwn(catgry,"Savings Accounts");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@id='select2-product-container']")).click();
        List<WebElement> prodType = driver.findElements(By.xpath("//ul[@id='select2-product-results']/li"));
        selectOptionsFrmDrpDwn(prodType,"Tikiri Savings Account");


    }
    public static void selectOptionsFrmDrpDwn(List<WebElement> option, String value)
    {
        for (WebElement optn:option){
            if (optn.getText().equals(value)){
                optn.click();
                break;
            }
        }

    }
}

