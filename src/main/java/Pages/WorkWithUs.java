package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkWithUs {


    WebDriver driver;

    public WorkWithUs(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    private String url="https://www.globallogic.com/ua/work-with-us/";

    public WorkWithUs(String url) {
        this.url = url;
    }



    @FindBy (how = How.XPATH,using = ".//*[@data-related-select='office']")
    private WebElement countrys;

    @FindBy(how = How.XPATH,using = ".//*[@name='office']")
    private WebElement city;

    @FindBy (how = How.XPATH,using =".//*[@name='job_category']" )
    private WebElement position;

    @FindBy (how = How.XPATH,using = ".//*[@class='btn mod-orange']")
    private WebElement search;

    @FindBy (how = How.XPATH,using = ".//*[@class='job-block']")
    private WebElement jobBlock;


    private void countJobBlock(){


    }


    public void clickSearch(){
        search.click();
    }

    public void selectAll() {

        WebElement country = driver.findElement(By.xpath(".//*[@data-related-select='office']"));
        List<WebElement> listCountry = country.findElements(By.tagName("option"));
        System.out.println(listCountry.size());

        for (int i = 0; i < listCountry.size(); i++) {
            String element = listCountry.get(i).getAttribute("value");
            if (element.equals("Ukraine")) {
                listCountry.get(i).click();
            }
        }
        WebElement city = driver.findElement(By.xpath(".//*[@name='office']"));
        List<WebElement>listCity=city.findElements(By.tagName("option"));
        System.out.println(listCity.size());

        for(int i=0;i<listCity.size();i++) {
            String element = listCity.get(i).getAttribute("value");
            if (element.equals("Kyiv")) {
                listCity.get(i).click();
            }
        }
        WebElement position = driver.findElement(By.xpath(".//*[@name='job_category']"));
        List<WebElement>listPosition=position.findElements(By.tagName("option"));
        System.out.println(listPosition.size());

        for(int i=0;i<listPosition.size();i++){
            String element=listPosition.get(i).getAttribute("value");
            if(element.equals("Testing & Quality Assurance")){
                listPosition.get(i).click();
            }
        }
    }

public void countVacancies(){

    WebElement  vacancies = driver.findElement(By.xpath(".//*[@class='job-block-title']"));
    List<WebElement>listVacancies=driver.findElements(By.xpath(".//div[@class='job-block-title'][contains(text(),' ')]"));
    System.out.println(listVacancies.size());

    for(int i=0;i<listVacancies.size();i++){
        System.out.println(listVacancies.get(i).getText());
    }
}


//    public static class TestWorkWithUs extends Main{
//
//
//
//    @Test
//    public void SelectionOfPosition() throws InterruptedException {
//        WorkWithUs workWithUs=new WorkWithUs(driver);
//        driver.get("https://www.globallogic.com/ua/work-with-us/");
//        workWithUs.selectAll();
//        workWithUs.clickSearch();
//        Thread.sleep(2000);
//        workWithUs.countVacancies();
//    }
//
//
//
//}
}
