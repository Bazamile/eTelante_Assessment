package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WebTables {

    public static WebDriver driver;

    @FindBy(xpath = "//button[@class='btn btn-link pull-right'][contains(.,'Add User')]")
    static WebElement AddUser_xpath;
    @FindBy(xpath = "//span[contains(.,'First Name')]")
    static WebElement Text_Firstname_xpath;
    @FindBy(xpath = "//input[@name='FirstName']")
    static WebElement FirstName_xpath;
    @FindBy(xpath = "//input[@name='LastName']")
    static WebElement LastName_xpath;
    @FindBy(xpath = "//input[@name='UserName']")
    static WebElement User_xpath;
    @FindBy(xpath = "//input[@type='password']")
    static WebElement Password_xpath;
    @FindBy(xpath = "//input[contains(@class,'ng-valid ng-dirty')]")
    static WebElement Customer_xpath;
    @FindBy(xpath = "//input[contains(@type,'email')]")
    static WebElement Email_xpath;

    @FindBy(xpath = "//input[contains(@name,'Mobilephone')]")
    static WebElement Cell_Phone_xpath;
    @FindBy(xpath = "//label[@class='radio ng-scope ng-binding'][contains(.,'Company AAA')]")
    static WebElement Customer_xpath_Radio;
    @FindBy(xpath = "//select[@name='RoleId']")
    static WebElement Role_xpath_dropdown;
    @FindBy(xpath = "//button[contains(.,'Save')]")
    static WebElement Save_xpath_Button;
    @FindBy(xpath = "//button[@ng-click='close()'][contains(.,'Close')]")
    static WebElement Close_xpath_button;


    public WebTables(WebDriver driver) {
        this.driver = driver;
    }

    public static void verifyFirstnameIsDisplayedWebTablesPage() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Text_Firstname_xpath));
        String FirstNameText = Text_Firstname_xpath.getText();
        Assert.assertEquals(FirstNameText, "First Name");
    }

    public static void clickAddUserButton() {
        AddUser_xpath.click();
    }

    public static void enterFirstName(String FirstName) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FirstName_xpath)).sendKeys(FirstName);
    }

    public static void enterLastName(String LastName) {

        LastName_xpath.sendKeys(LastName);
    }

    public static void enterUserName() {
//        String usernamePrefix = "user";
        int currentNumber = 1;
        Faker faker = new Faker();
        String username = faker.name().username();
        //String username = usernamePrefix + currentNumber++;
        User_xpath.sendKeys(username);
        currentNumber++;

    }

    public static void enterPassword(String Password) {

        Password_xpath.sendKeys(Password);
    }

    public static void selectCustomerButton() {
        WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(2));
        d.until(ExpectedConditions.visibilityOf(Customer_xpath_Radio));
        Customer_xpath_Radio.click();

    }

    public static void selectRoleButton(String Role) {
        WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(2));
        d.until(ExpectedConditions.visibilityOf(Role_xpath_dropdown));
        Role_xpath_dropdown.click();
        Select dr = new Select(Role_xpath_dropdown);
        dr.selectByVisibleText(Role);
    }

    public static void enterEmail(String Email) {
        WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(2));
        Email_xpath.sendKeys(Email);
    }

    public static void enterCellPhone(String Cell) {

        Cell_Phone_xpath.sendKeys(Cell);
    }

    public static void clickSaveButton() {
        Save_xpath_Button.click();
    }

    public static void clickCloseButton() {
        Close_xpath_button.click();
    }


}





