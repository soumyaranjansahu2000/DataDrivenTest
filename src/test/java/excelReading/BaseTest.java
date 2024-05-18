package excelReading;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
    public ExtentReports report;
    public ExtentSparkReporter spark;
    public ExtentTest test;
   // Calendar cal = Calendar.getInstance();
    Date dt =new  Date();
    
    @BeforeSuite
    public void report() {
        // Format the date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String formattedDate = sdf.format(dt);
        
        // Create instance
        report = new ExtentReports();
        
        // Provide path of report with formatted date
        spark = new ExtentSparkReporter("./reports/Spark_" + formattedDate + ".html");
        
        // Set some configurations
        spark.config().setReportName("AutomationReport");
        spark.config().setDocumentTitle("Sprint 1 Automation Report");
        spark.config().setTheme(Theme.DARK);
        
        // Attach spark report to extent report
        report.attachReporter(spark);
        
        // Create test
        test = report.createTest("Login Test");
        
        // Set logs (optional)
//        test.pass("LoginTest Pass");
//        test.fail("Test is fail");
//        test.skip("Test is skip");
    }
    
    @AfterSuite
    public void tearDown() {
        report.flush();
    }
}
