package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginPage;

public class POM_login {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\alvin\\IdeaProjects\\MySkill\\btech-uiautomation\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl = "https://parabank.parasoft.com/parabank/index.htm";

        //Data
        String username = "btec";
        String password = "123456";

        String invalidUsername = "tidakTerdaftar";

        loginPage loginPage = new loginPage(driver);
        //Initiate Driver & URL
        driver.get(BaseUrl);

        //getTitle
        driver.getTitle();

        //Input invalid username & password valid
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);

        //Click button Login
        loginPage.clickLogin();
    }
}
