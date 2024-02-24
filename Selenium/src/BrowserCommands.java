import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //3.maximize the URL
        driver.manage().window().maximize();

        //2.
        String URL = "https://demoqa.com/browser-windows";
        driver.get(URL);

        //4.
        String curntURL = driver.getCurrentUrl();
        System.out.println("URL of the webpage is: "+curntURL);
        if (curntURL.equals(URL)){
            System.out.println("URL Verified");
        }else {
            System.out.println("URL not Verified");
        }

//        5.
        String crntTitle = driver.getTitle();
        System.out.println("Title of the Webpage is: "+crntTitle);

        if (crntTitle.equals("DEMOQA")){
            System.out.println("Title Verified");
        }else {
            System.out.println("Title not Verified");
        }

        // 6.
        int Titlelng = driver.getTitle().length();
        System.out.println("Length of the title is: "+Titlelng);

        //7.
        String pgSrc = driver.getPageSource();
        System.out.println("Page source is: "+pgSrc);

        //8.
        int pglength= driver.getPageSource().length();
        System.out.println("Length of the Page source is: "+pglength);

        //9.
        driver.findElement(By.id("tabButton")).click();

        //10.
        Thread.sleep(3600);
//        driver.close();

        //11.
        driver.quit();
    }
}
