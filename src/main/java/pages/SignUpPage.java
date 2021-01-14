package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {


    @FindBy(partialLinkText="//a[contains(text(),'New customer')]")
    WebElement new_customer;

    private WebDriver driver;



    public SignUpPage(){
        initialize();
        this.driver=BasePage.driver;
        PageFactory.initElements(driver,this);
    }

    public void clickNewCustomer(){
       // driver.findElement(By.xpath("//a[contains(text(),'New customer')]")).click();
        new_customer.click();
    }

}
