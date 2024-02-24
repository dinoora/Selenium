package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTwo {
    @Test
    public void testTwo() throws InterruptedException {
        System.out.println("This is the test two");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        driver.close();
    }
}
