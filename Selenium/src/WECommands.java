import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.HTML;
import java.util.List;

public class WECommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //maximize the URL
        driver.manage().window().maximize();

        //2.
        driver.get("https://login.yahoo.com/account/create");

        //3.
//        driver.findElement(By.id("user_email_login")).sendKeys("codex@gmail.com");
//        driver.findElement(By.id("user_password")).sendKeys("123abc");
//
//        Thread.sleep(7200);
//        //4.
//        driver.findElement(By.id("user_email_login")).clear();
//        driver.findElement(By.id("user_password")).clear();

        //5.
//        driver.findElement(By.id("user_submit")).submit();

        //6.
        String getTxt=driver.findElement(By.linkText("Sign in")).getText();
        System.out.println(getTxt);

        //7.
        WebElement email=driver.findElement(By.id("reg-submit-button"));
        Point point = email.getLocation();
        System.out.println("X Cordinates: "+point.x);
        System.out.println("Y Cordinates: "+point.y);
//
//        //8.
        WebElement email1 = driver.findElement(By.id("reg-submit-button"));
        Dimension dim = email1.getSize();
        System.out.println("Height is: "+dim.height);
        System.out.println("Width is: "+dim.width);

        //9
        String TagName = driver.findElement(By.id("reg-submit-button")).getTagName();
        System.out.println("Tag Name is: "+ TagName);

        //10.
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: "+links.size());

        //11. Display
        Boolean display = driver.findElement(By.id("reg-submit-button")).isDisplayed();
        System.out.println(display);

        //11. Enabled
        Boolean enable = driver.findElement(By.id("reg-submit-button")).isEnabled();
        System.out.println(enable);

        //11. Selected
        Boolean selected = driver.findElement(By.id("reg-submit-button")).isSelected();
        System.out.println(selected);



    }
}
