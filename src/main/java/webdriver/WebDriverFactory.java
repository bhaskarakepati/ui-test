package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";

    /**
     *
     * @param browserName
     * @return driver
     */
    public static WebDriver getInstance(String browserName){
        WebDriver driver = null;
        System.out.println("browser name:"+browserName);
        if(CHROME.equals(browserName)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(FIREFOX.equals(browserName)){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
            throw new IllegalArgumentException("Unsupported browser");
        }

        return driver;

    }
}
