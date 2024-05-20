package Tests;
import Pages.WebTables;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("Chrome", "http://www.way2automation.com/angularjs-protractor/webtables//");
    WebTables webTables = PageFactory.initElements(driver,WebTables.class);
    TakeScreenshots takeScreenshots = new TakeScreenshots();



    }





