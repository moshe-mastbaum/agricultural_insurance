import Pageobject.*;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Base {

    //Attributes
    HomePage homePage;
    WhyUsPage whyUsPage;
    IsFirstTimePage isFirstTimePage;
    IsFromIsraelPage isFromIsraelPage;
    WhereToPage whereToPage;
    DatePage datePage;
    PassengersPage passengersPage;
    CoversPage coversPage;
    SpecialCoversPage specialCoversPage;
    HealthDeclarationPage healthDeclarationPage;
    PaymentPage paymentPage;
    FindDocumentsPage findDocumentsPage;
    InsuranceCheckPage insuranceCheckPage;
    ContactUsPage contactUsPage;


    public static WebDriver driver;
    static String configPath = "C:\\Users\\Admin\\IdeaProjects\\agricultural_insurance\\src\\testData\\config.xml";
    static String url1;
    //report;
//    static ExtentReports extent;
//    static ExtentTest test;

    @BeforeSuite
    public static void setUp() throws ParserConfigurationException, IOException, SAXException {
//         Initialize Extent Reports
//        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);

        url1 = readFromFile("url1" ,configPath);

//        Set up WebDriver
        String browserName = readFromFile("browser" ,configPath);
        System.out.println("BROWSER NAME: " +browserName);
        if (browserName.equals("chrome"))
           driver = new ChromeDriver();
        else if (browserName.equals("firefox"))
           driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @BeforeTest
    public void initializing() throws InterruptedException{
        homePage = new HomePage(driver);
        whyUsPage = new WhyUsPage(driver);
        isFirstTimePage = new IsFirstTimePage(driver);
        isFromIsraelPage = new IsFromIsraelPage(driver);
        whereToPage = new WhereToPage(driver);
        datePage = new DatePage(driver);
        passengersPage = new PassengersPage(driver);
        coversPage = new CoversPage(driver);
        specialCoversPage = new SpecialCoversPage(driver);
        healthDeclarationPage = new HealthDeclarationPage(driver);
        paymentPage = new PaymentPage(driver);
        findDocumentsPage = new FindDocumentsPage(driver);
        insuranceCheckPage = new InsuranceCheckPage(driver);
        contactUsPage = new ContactUsPage(driver);

//        driver.get("https://www.bth.co.il/");
        driver.get(url1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 350);");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#abroadplus ")).click();

//        WebElement pElement = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#abroadplus "))
//        );
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pElement);
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#abroadplus ")).click();


        //*[@id="abroadplus"]
//        homePage = new HomePage(driver);
//        createStudentPage = new Create_student_page(driver);
//        loginPage = new LoginPage(driver);
//        driver.get("https://turnitin.com/newuser_type.asp");
    }

//    @AfterAll
    public static void close (){
//        driver.quit();
        // Flush Extent Reports
//        extent.flush();
    }

//     static String readFromFile(String keyData, String pathName) throws ParserConfigurationException, IOException, SAXException {
    public static String readFromFile(String keyData, String pathName) throws ParserConfigurationException, IOException, SAXException {
        String value = null;
        try {
            // Load the XML file
            File xmlFile = new File(pathName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            // Normalize the document
            doc.getDocumentElement().normalize();

            // Extract values from XML
            value = doc.getElementsByTagName(keyData).item(0).getTextContent();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }


}
