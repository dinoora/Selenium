package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestThree {
    @Test
    public void testThree() throws InterruptedException {
        System.out.println("This is Test Three");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companion/");

        Thread.sleep(5000);

        driver.close();
    }
}
