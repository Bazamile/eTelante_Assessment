package Tests;

import Utils.TakeScreenshots;
import org.testng.annotations.Test;

@Test
public class WebTablesTests extends Base {

    public void verifyFirstnameIsDisplayedWebTablesPageTests() {

        webTables.verifyFirstnameIsDisplayedWebTablesPage();
        takeScreenshots.takeSnapShot(driver,"Verify the column Name");
    }

    @Test(dependsOnMethods = {"verifyFirstnameIsDisplayedWebTablesPageTests"})
    public void clickAddUserButtonTests() {
        webTables.clickAddUserButton();
    }

    @Test(dependsOnMethods = {"clickAddUserButtonTests"})
    public void enterFirstNameTests() {
        webTables.enterFirstName();
        takeScreenshots.takeSnapShot(driver,"Add a user");
    }

    @Test(dependsOnMethods = {"enterFirstNameTests"})
    public void enterLastNameTests() {
        webTables.enterLastName();
    }

    @Test(dependsOnMethods = {"enterLastNameTests"})
    public void enterUserNameTests() {
        webTables.enterUserName();
    }

    @Test(dependsOnMethods = {"enterUserNameTests"})
    public void enterPasswordTests() {
        webTables.enterPassword();
    }

    @Test(dependsOnMethods = {"enterPasswordTests"})
    public void selectCustomerButtonTests() {
        webTables.selectCustomerButton();
    }

    @Test(dependsOnMethods = {"selectCustomerButtonTests"})
    public void selectRoleButtonTests() {
        webTables.selectRoleButton();
    }

    @Test(dependsOnMethods = {"selectRoleButtonTests"})
    public void enterEmailTests() {
        webTables.enterEmail();

    }

    @Test(dependsOnMethods = {"enterEmailTests"})
    public void enterCellPhoneTests() {
        webTables.enterCellPhone();

    }

    @Test(dependsOnMethods = {"enterCellPhoneTests"})
    public void clickSaveButtonTests() {
        webTables.clickSaveButton();
        takeScreenshots.takeSnapShot(driver,"Added a user to the table");

    }


}
