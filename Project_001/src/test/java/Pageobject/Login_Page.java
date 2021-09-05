package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    public Login_Page (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using ="//input[@name='email']")
    public WebElement email;

    @FindBy(how = How.CSS, using ="input[placeholder='Password']")
    public WebElement password;

    @FindBy(how = How.XPATH, using ="//input[@type='submit']")
    public WebElement loginbtn;

    @FindBy(how = How.NAME, using ="email")
    public WebElement profileName;




}
