package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webdriver.WebDriverFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public static WebDriver driver;
   public static Properties prop;

    public BasePage(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java" +
                    "/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialize(){
        String browserName = prop.getProperty("browser");
        System.out.println("browser:"+browserName);
        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }



}
