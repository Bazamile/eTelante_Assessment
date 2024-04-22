package Tests;

import Pages.WebTables;
import org.testng.annotations.Test;

public class WebTablesTests extends Base {

    @Test
    public void verifyFirstnameIsDisplayedWebTablesPageTests(){
        WebTables.verifyFirstnameIsDisplayedWebTablesPage();
        takeScreenshots.takeSnapShot(driver, "Home Screen");
    }
    @Test(dependsOnMethods = "verifyFirstnameIsDisplayedWebTablesPageTests")
    public void clickAddUserButtonTests() {
        WebTables.clickAddUserButton();
        takeScreenshots.takeSnapShot(driver, "Add User");
    }

    @Test(dependsOnMethods = "clickAddUserButtonTests")
    public void enterFistNameTests() {
        WebTables.enterFirstName();
    }

    @Test(dependsOnMethods = "enterFistNameTests")
    public void enterLastNameTests() {
        WebTables.enterLastName();
    }

    @Test(dependsOnMethods = "enterLastNameTests")
    public void enterUserNameTests() {
            WebTables.enterUserName();
    }

    @Test(dependsOnMethods = "enterUserNameTests")
    public void enterPasswordTests() {
        WebTables.enterPassword();
    }
    @Test(dependsOnMethods = "enterPasswordTests")
    public void selectCustomerButtonTests() {
        WebTables.selectCustomerButton();
    }
    @Test(dependsOnMethods = "enterPasswordTests")
    public void selectRoleButtonTests() {
        WebTables.selectRoleButton();
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void enterEmailTests() {
        WebTables.enterEmail();
    }
    @Test(dependsOnMethods = "enterEmailTests")
    public void enterCellPhoneTests() {
        WebTables.enterCellPhone();
    }
    @Test(dependsOnMethods = "enterCellPhoneTests")
    public void clickSaveButtonTests() {
        WebTables.clickSaveButton();
        takeScreenshots.takeSnapShot(driver, "Added a User");
    }
}
