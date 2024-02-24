import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MWH {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.out.println(driver.getWindowHandle());

        driver.quit();

        System.out.println(driver.getWindowHandles().size());
       // driver.manage().window().maximize();

//        driver.get("https://demoqa.com/browser-windows");
//
////        Print the parent window handle
//        String parentWndw = driver.getWindowHandle();
//        System.out.println("Parent Window Handle is: "+parentWndw);
//
////Click on ‘New Window’ 3 times
//        for (int i=1; i<=3;i++) {
//            driver.findElement(By.xpath("//button[@id='windowButton']")).click();
//            Thread.sleep(2000);
//        }
//
////        Print Window handles
//        Set<String> wndwHndles = driver.getWindowHandles();
//        String lastwndwhandle = "";
//
//        for (String handles:wndwHndles){
//            System.out.println("Window handles are: "+handles);
//
//            System.out.println("Switching Windows: "+handles);
//
//            driver.switchTo().window(handles);
//
//            Thread.sleep(2000);
////            Navigate to ebay.com
//            driver.get("https://www.ebay.com/");
//
////            Maximize the page
//            driver.manage().window().maximize();
//
//        }

    }
}
