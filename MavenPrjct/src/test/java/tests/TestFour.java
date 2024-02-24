package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class TestFour {
    @Test
    public void testFour() throws InterruptedException {
        System.out.println("This is Test Four");

        WebDriver driver = new ChromeDriver();
        driver.get("https://commons.apache.org/io/download_io.cgi");

        Thread.sleep(5000);

        driver.close();
    }
}
