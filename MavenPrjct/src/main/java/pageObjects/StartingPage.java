package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartingPage {
    WebDriver driver;
    public StartingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/div[2]/div[2]/div/button")
    WebElement loginbtn;

    public WebElement loginbtn(){
        return loginbtn;
    }
}
