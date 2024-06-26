package framework.utils.initializers;

import com.aventstack.extentreports.Status;
import framework.utils.globalConstants.PathConfig;
import framework.utils.reportManagement.OutputUtil;
import framework.utils.reportManagement.extent.ExtentTestManager;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* -----------------------------------------------------------------------
   - ** Rest API Testing Framework using RestAssured **
   - Author: Krishan Chawla (krishanchawla1467@gmail.com)
   - Git Repo: https://github.com/krishanchawla/api-testing-rest-assured-java-framework
   ----------------------------------------------------------------------- */
public class TestInit {

    private final Logger _logger = LogManager.getLogger(TestInit.class);

    @BeforeSuite(alwaysRun = true)
    public void initializeTestSuite() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        System.setProperty("current.date", LocalDateTime.now().format(format));
        OutputUtil.createOutputDirectory();

        System.setProperty("applogs.path", PathConfig.getApplogsPath() + "ExecutionLog.log");
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        ctx.reconfigure();

       _logger.info("*** Test Suite  started ***");
    }

    @BeforeClass(alwaysRun = true)
    public void initializeTestClass(ITestContext context) {

    }

    @BeforeMethod(alwaysRun = true)
    public void config(ITestResult result) {
    	System.out.println("*********************************************************************");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult iTestResult) {

        if (iTestResult.getStatus() == ITestResult.SUCCESS) {

        } else if (iTestResult.getStatus() == ITestResult.FAILURE) {
            ExtentTestManager.log(_logger, Status.FAIL, iTestResult.getThrowable());
        } else if (iTestResult.getStatus() == ITestResult.SKIP) {
            ExtentTestManager.log(_logger, Status.SKIP, iTestResult.getThrowable());
        }

        ExtentTestManager.endTest();
    	System.out.println("*********************************************************************");

    }

    @AfterSuite(alwaysRun = true)
    public void completeSuite() {
        _logger.info("*** Test Suite  ending ***");
    }
    
	
}
