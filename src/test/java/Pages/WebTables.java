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
import java.util.Random;


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
    static Faker faker = new Faker();
    static Random random = new Random();


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

    public static void enterFirstName() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FirstName_xpath)).sendKeys("Fname1");
    }

    public static void enterLastName() {

        LastName_xpath.sendKeys("LName1");
    }
    public static void enterUserName() {
        String fullName = faker.name().fullName();
        String name = fullName.split(" ")[0];
        int randomNumbers = random.nextInt(10000000) + 1;
        String username = name + "_" + randomNumbers;
        User_xpath.sendKeys(username);


    }
    public static void enterPassword() {

        Password_xpath.sendKeys("Pass1");
    }

    public static void selectCustomerButton() {
        WebDriverWait d = new WebDriverWait(driver,Duration.ofSeconds(2));
        d.until(ExpectedConditions.visibilityOf(Customer_xpath_Radio));
        Customer_xpath_Radio.click();

    }
    public static void selectRoleButton() {
        WebDriverWait d = new WebDriverWait(driver,Duration.ofSeconds(2));
        d.until(ExpectedConditions.visibilityOf(Role_xpath_dropdown));
        Role_xpath_dropdown.click();
        Select dr = new Select(Role_xpath_dropdown);
        dr.selectByVisibleText("Admin");
}
    public static void enterEmail() {
        WebDriverWait d = new WebDriverWait(driver,Duration.ofSeconds(2));
        Email_xpath.sendKeys("admin@mail.com");
    }
    public static void enterCellPhone() {

        Cell_Phone_xpath.sendKeys("082555");
    }
    public static void clickSaveButton() {
        Save_xpath_Button.click();
    }


}





