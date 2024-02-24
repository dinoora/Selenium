import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //maximize the URL
        driver.manage().window().maximize();

        driver.get("https://money.rediff.com/gainers");

        //self-node
        String self = driver.findElement(By.xpath("//a[contains(.,'DRA')]/self::a")).getText();
        System.out.println("Self node is "+self);
        //parent-node
        String parent=driver.findElement(By.xpath("//a[contains(.,'DRA')]/parent::td")).getText();
        System.out.println("Parent node is " +parent);
        //child node
        List<WebElement> child = driver.findElements(By.xpath("//a[contains(.,'DRA')]/ancestor::tr/child::*"));
        System.out.println("Number of Child nodes: "+child.size());
        //Ancestor node
        String ancestor = driver.findElement(By.xpath("//a[contains(.,'DRA')]/ancestor::tr")).getText();
        System.out.println("Ancestor Node is: "+ancestor);
        //following
        List<WebElement> following=driver.findElements(By.xpath("//a[contains(.,'DRA')]/following::*"));
        System.out.println("Number of following elements from the self HTML tag is: "+following.size());
        //following siblings
        List<WebElement> flwng_Sib=driver.findElements(By.xpath("//a[contains(.,'DRA')]/ancestor::tr/following-sibling::*"));
        System.out.println("Following siblings are: "+flwng_Sib.size());
        //preceding
        List<WebElement> pre = driver.findElements(By.xpath("//a[contains(.,'DRA')]/preceding::*"));
        System.out.println("The number of preceding elements: "+pre.size());
        //preceding siblings
        List<WebElement> pre_siblings = driver.findElements(By.xpath("//a[contains(.,'DRA')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("Number of preceding siblings are: "+pre_siblings.size());
        driver.close();
    }
}