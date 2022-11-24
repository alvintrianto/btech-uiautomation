package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    //
    public loginPage(WebDriver driver){
        this.driver= driver;
    }

    //Define locator for login field
    By usernameField = By.name("username");
    By passwordField = By.name("password");

    //Define locator for login button
    By loginButton = By.xpath("//*[@id='loginPanel']/form/div[3]/input");

    //Define input field
    public void inputUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    //Define click login
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}
