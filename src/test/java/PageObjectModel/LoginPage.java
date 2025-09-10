package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver = null;
    public LoginPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy (name = "username")
    WebElement useNameTextBox;

    @FindBy (name = "password")
    WebElement passWordTextBox;

    @FindBy (xpath = "//*[@class='oxd-form-actions orangehrm-login-action']")
    WebElement loginButton;

    @FindBy (xpath = "//h6[text() = 'Dashboard']")
    WebElement DashBoardText;

    public void EnterUserName (String userName) {
        useNameTextBox.sendKeys(userName);
    }
    public void EnterPassword (String passWord) {
        passWordTextBox.sendKeys(passWord);
    }

    public void ClickLoginButton (){
        loginButton.click();
    }
}
