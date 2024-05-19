package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.io.File;

public class ExtentReportManager {
    static final String Report_Dir = "./Reports/eTelante Assessment Report.html";
    private static ExtentReports extentReports;
    private static ExtentSparkReporter extentSparkReporter;
private ExtentReportManager() {
}
    public static ExtentReports extentSetup() {
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(new File(Report_Dir));
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Extent Report");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("eTelante Assessment Report");
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Execution Machine", System.getProperty("user.name"));

        return extentReports;

    }

    @Test
    public void test(){
        System.out.println(Report_Dir);
    }

}
