import Pageobject.*;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.testng.asserts.SoftAssert;

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
    SoftAssert softAssert;

    public static WebDriver driver;
    static String configPath = "C:\\Users\\Admin\\IdeaProjects\\agricultural_insurance\\src\\testData\\config.xml";
    static String url1;

    public static String takeScreenShot() {
        try {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String fileName = timeStamp + "_" + System.currentTimeMillis() + ".png";
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            Path destinationPath = new File("screenshots/" + fileName).toPath();
            Files.createDirectories(destinationPath.getParent());
            Files.copy(screenShotFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);

            // Add to allure report
            Allure.addAttachment("Screenshot - " + timeStamp,
                    Files.newInputStream(screenShotFile.toPath()));
            return fileName;
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
            return null;
        }
    }

    @BeforeSuite
    public static void setUp() throws ParserConfigurationException, IOException, SAXException {

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

        softAssert = new SoftAssert();

        driver.get(url1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void after_test() {
        if (driver != null) {
            takeScreenShot();
        }
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
