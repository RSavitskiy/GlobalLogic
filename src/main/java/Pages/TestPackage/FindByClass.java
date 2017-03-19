package Pages.TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindByClass {


    @FindBy(how = How.XPATH,using = ".//*[@id='text']")
    private WebElement search;


    public FindByClass fieldSearch(){
        return  this;
    }
}
