package Tests;

import Pages.WebTables;
import Utils.ReadFromExcel;
import org.testng.annotations.Test;

@Test
public class WebTablesTests extends Base {

    public void verifyFirstnameIsDisplayedWebTablesPageTests() {

        webTables.verifyFirstnameIsDisplayedWebTablesPage();
    }

    @Test(dependsOnMethods = {"verifyFirstnameIsDisplayedWebTablesPageTests"})
    public void clickAddUserButtonTests() {
        webTables.clickAddUserButton();
    }

    @Test(dependsOnMethods = {"clickAddUserButtonTests"})
    public void enterFirstNameTests() {
        webTables.enterFirstName(ReadFromExcel.FirstName);
    }

    @Test(dependsOnMethods = {"enterFirstNameTests"})
    public void enterLastNameTests() {
        webTables.enterLastName(ReadFromExcel.LastName);
    }
    @Test(dependsOnMethods = {"enterLastNameTests"})
    public void enterUserNameTests(){
        webTables.enterUserName(ReadFromExcel.UserName);
    }
    @Test(dependsOnMethods = {"enterUserNameTests"})
    public void enterPasswordTests(){
        webTables.enterPassword(ReadFromExcel.Password);
    }
    @Test(dependsOnMethods = {"enterPasswordTests"})
    public void selectCustomerButtonTests(){
        webTables.selectCustomerButton();
    }
    @Test(dependsOnMethods = {"selectCustomerButtonTests"})
    public void selectRoleButtonTests(){
        webTables.selectRoleButton(ReadFromExcel.Customer);
    }
    @Test(dependsOnMethods = {"selectRoleButtonTests"})
    public void enterEmailTests(){
        webTables.enterEmail(ReadFromExcel.Email);

    }
    @Test(dependsOnMethods = {"enterEmailTests"})
    public void enterCellPhoneTests(){
        webTables.enterCellPhone(ReadFromExcel.Cell);

    }
    @Test(dependsOnMethods = {"enterCellPhoneTests"})
    public void clickSaveButtonTests(){
        webTables.clickSaveButton();

    }
    @Test(dependsOnMethods = {"clickSaveButtonTests"})
    public void clickCloseButtonTests(){
        webTables.clickCloseButton();

    }


}
