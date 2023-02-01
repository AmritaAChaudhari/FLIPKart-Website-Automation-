package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.Utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {

    public static WebDriver driver;
    public Properties prop;

    public WebTestBase() {
        try {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Properties/config.properties");
            prop.load(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver.exe");
            driver = new EdgeDriver();
        } else if (browserName.equals("opera")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver.exe");
            driver = new SafariDriver();
        } else {
            System.out.println("Please select correct browser name");
        }
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD_TIMEOUT));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICITLY_WAIT));
        driver.manage().deleteAllCookies();


    }

}
