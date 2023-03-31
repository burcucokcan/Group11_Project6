package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class leftPanel extends Parent{
    public leftPanel() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(linkText = "Register")
    private WebElement register;

    @FindBy(linkText = "Bill Pay")
    private WebElement billPay;
    @FindBy(xpath = "//div[@class='login'][1]//input")
    private WebElement userName;
    @FindBy(xpath = "//div[@class='login'][2]//input")
    private WebElement password;
    @FindBy(xpath = "//div[@class='login'][3]//input")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logOut;

    public WebElement getLogOut() {
        return logOut;
    }

    public WebElement getWebElement(String str){

        switch(str){
            case "username" : return userName;
            case "password" : return password;
            case "register" : return register;
            case "loginbutton" : return loginButton;
            case "logout" : return logOut;
            case "billpay" : return billPay;
        }
        return null;

    }

}
