import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //3.maximize the URL
        driver.manage().window().maximize();

        //2.
        driver.get("https://www.amazon.com/");

        //4.
        driver.get("https://www.ebay.com/");

        //5.
        driver.findElement(By.id("gh-ac")).sendKeys("t-shirts");

        //6.
        Thread.sleep(3600);
        driver.navigate().refresh();
        System.out.println("Browser Refreshed");

        //7.
        Thread.sleep(3600);
        driver.navigate().back();
        System.out.println("Navigated Back to Amazon");

        //8.
        Thread.sleep(3600);
        driver.navigate().forward();
        System.out.println("Navigated to eBay");

        //9.
        driver.close();
    }
}
