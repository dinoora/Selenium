import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSggest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.findmyfare.com/");

        //autosuggestion
        WebElement to= driver.findElement(By.xpath("//input[@id='origin_0']"));
        to.click();
        to.sendKeys("China");
        Thread.sleep(5000);
        to.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(5000);
        to.sendKeys(Keys.ENTER);
    }
}
