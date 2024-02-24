import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Axes {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //maximize the URL
        driver.manage().window().maximize();

        //URL
        driver.get("https://login.yahoo.com/account/create");

        //XPath Axes

        //1.Self Node
        driver.findElement(By.xpath("//input[@id='usernamereg-userId']/self::input")).sendKeys("codex");

        //2.Parent Node
        String parentText = driver.findElement(By.xpath("//input[@id='usernamereg-userId']/parent::*")).getText();
        System.out.println("Parent values is: "+parentText);

        //3.Child Nodes
        List<WebElement> childNodes = driver.findElements(By.xpath("//input[@id='usernamereg-userId']/parent::fieldset/child::*"));
        System.out.println("Number of Child Nodes: "+childNodes.size());

        //4. Following Nodes
        List<WebElement> flwngNodes = driver.findElements(By.xpath("//input[@id='usernamereg-userId']/following::*"));
        System.out.println("Number of following nodes: "+flwngNodes.size());

        //5. Preceding Nodes
        List<WebElement> precdngNodes = driver.findElements(By.xpath("//input[@id='usernamereg-userId']/preceding::*"));
        System.out.println("Number of preceding nodes: "+precdngNodes.size());

        //6. following-siblings
        List<WebElement> flwngSib = driver.findElements(By.xpath("//input[@id='usernamereg-userId']/following-sibling::*"));
        System.out.println("Number of following sibling nodes: "+flwngSib.size());

        //7.preceding siblings
        List<WebElement>  precdngSib = driver.findElements(By.xpath("//input[@id='usernamereg-userId']/parent::fieldset/preceding-sibling::*"));
        System.out.println("Number of preceding siblings: "+precdngSib.size());


    }


}