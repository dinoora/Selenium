import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class pageSS {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://commons.apache.org/");

        //full-page screenshot
//        TakesScreenshot takeSS = (TakesScreenshot)driver;
//        File src = takeSS.getScreenshotAs(OutputType.FILE);
//        File target = new File("./screenshots/homepage.png");
//        FileUtils.copyFile(src, target);

        //Section of a page
//        WebElement section = driver.findElement(By.xpath("//tbody//tr//section[1]"));
//        File sectionSrc = section.getScreenshotAs(OutputType.FILE);
//        File targetSection = new File("./screenshots/section.png");
//        FileUtils.copyFile(sectionSrc, targetSection);

        //element screenshot
        //WebElement element = driver.findElement(By.xpath("//img[@alt='Apache Commons logo']"));
        WebElement element = driver.findElement(By.xpath("//li[@id='projectVersion']"));
        File elementSrc = element.getScreenshotAs(OutputType.FILE);
        File targetelement = new File("./screenshots/elementLink.png");
        FileUtils.copyFile(elementSrc, targetelement);

        driver.quit();
    }
}