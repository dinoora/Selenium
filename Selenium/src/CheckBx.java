import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ndbbank.com/");

        //Page Scroll
        JavascriptExecutor jse = (JavascriptExecutor)  driver;
        jse.executeScript("window.scroll(0,2500)");
        Thread.sleep(2000);

        //handle the checkbox
        WebElement banking = driver.findElement(By.xpath("//input[@id='365_banking']"));
        WebElement atm = driver.findElement(By.xpath("//input[@id='offsite_atm']"));
        WebElement night = driver.findElement(By.xpath("//input[@id='night_banking']"));


        banking.click();
        atm.click();
        Thread.sleep(4000);
        atm.click();

        //isDisplayed: T if the element is displayed
        Boolean boolDisp = night.isDisplayed();
        System.out.println("Night Banking is: "+boolDisp); //true
        //isSelected: T if the element is selected
        Boolean boolSelected = banking.isSelected();
        System.out.println("365 Banking is: "+boolSelected); //true
        //isEnabled: T if the element is enabled
        Boolean boolEnabled = atm.isEnabled();
        System.out.println("Offsite ATM is: "+boolEnabled); //true

    }
}

