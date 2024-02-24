import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitvsClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //maximize the URL
        driver.manage().window().maximize();

        driver.get("file:///Users/dinoo/Documents/Extra/Selenium/demo/submitclick.html");

//        driver.findElement(By.id("txtSubmit")).click();
//        driver.findElement(By.id("frmsubmit")).click();
//        driver.findElement(By.id("txtbutton")).click();

        //button inside the form / type=submit
//        driver.findElement(By.id("frmsubmit")).submit();

        //button inside the form / type=button
        //driver.findElement(By.id("frmbutton")).submit();

        //button outside the form / type=submit
        driver.findElement(By.id("txtSubmit")).submit();
    }
}
