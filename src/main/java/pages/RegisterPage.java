package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static baseClass.BaseClass.driver;

public class RegisterPage {

    @FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "//textarea[@ng-model='Adress']")
    public WebElement address;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }


}
