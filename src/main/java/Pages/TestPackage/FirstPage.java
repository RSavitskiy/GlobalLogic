package Pages.TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPage {

    private WebDriver driver;

    public FirstPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public void waiter(String someXpathLocator){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(someXpathLocator)));
    }

}
