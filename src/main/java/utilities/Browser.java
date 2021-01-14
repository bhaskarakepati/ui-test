package utilities;

import org.openqa.selenium.WebDriver;
import webdriver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Browser {

    private static String baseUrl = PropertyLoader.loadProperty("url");
    private static String browserName = PropertyLoader.loadProperty("browser");
    private static WebDriver driver;

    public static void initialize(){
        System.out.println("browser:"+browserName+"  url:"+baseUrl);
        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static WebDriver getWebDriver(){
        return driver;
    }

    public static void close(){
        driver.quit();
    }
}
