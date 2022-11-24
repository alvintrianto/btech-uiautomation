package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class normalLogin {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\alvin\\IdeaProjects\\MySkill\\btech-uiautomation\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl = "https://parabank.parasoft.com/parabank/index.htm";

        //Data
        String username = "btec";
        String password = "123456";

        String invalidUsername = "tidakTerdaftar";

        //Initiate Driver & URL
        driver.get(BaseUrl);

        //getTitle
        driver.getTitle();

        //Input invalid username & password valid
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        //Click button Login
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
    }
}
