import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class DrpDwn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

        //select class
        WebElement drpdwn = driver.findElement(By.xpath("//select[@id='cars']"));
        Select selectelement = new Select(drpdwn);

        //find the options present in the dropdown menu
        List<WebElement> options = selectelement.getOptions();
        System.out.println(options.size());

        for (WebElement ele:options){
            System.out.println("The values are: "+ele.getText());
        }

        Boolean bool= selectelement.isMultiple();
        System.out.println(bool);

        //selectByIndex()
        selectelement.selectByIndex(0);
        //selectByValue()
        selectelement.selectByValue("audi");
        //selectByVisibleText
        selectelement.selectByVisibleText("Saab");

        Thread.sleep(3000);

        //deselect
//        selectelement.deselectByIndex(3);
//        selectelement.deselectByValue("saab");
//        selectelement.deselectByVisibleText("Volvo");

        //first selected value
        System.out.println("First selected option is: "+selectelement.getFirstSelectedOption().getText());

        selectelement.deselectAll();

    }
}
