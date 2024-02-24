import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://commons.apache.org/");

        //How many rows in the table
        int rows = driver.findElements(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr")).size();
        System.out.println("Total number of rows: " + rows);

        //How many columns in the table
        int cols = driver.findElements(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr/th")).size();
        System.out.println("Total number of columns: " + cols);

        //specific row/column data
        String text = driver.findElement(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr[5]/td[2]")).getText();
        System.out.println("Data item in row[5] col[2] is: " + text);

        //print all the data in the table
//        System.out.println("Data in the table are---------------------");
//        for (int r = 2; r <= rows; r++) { //1 2 3
//            for (int c = 1; c <= cols; c++) { //1 2 3 4 5
//                String data = driver.findElement(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
//                System.out.print(data + "      ");
//            }
//            System.out.println();
//
//        }

        //Print the description, version, release date of "Digester"
        for (int r = 2; r <= rows; r++) {
            String data = driver.findElement(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr[" + r + "]/td[1]")).getText();
            if (data.equals("Digester")){
                String description = driver.findElement(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr[" + r + "]/td[2]")).getText();
                String version = driver.findElement(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr[" + r + "]/td[4]")).getText();
                String rdate = driver.findElement(By.xpath("//table[@class='bodyTable table table-striped table-bordered']/tbody/tr[" + r + "]/td[5]")).getText();
                System.out.println("The Digester is a "+description+" with the newest version "+version+" released on "+rdate+".");
            }
        }


        driver.quit();
    }
}
