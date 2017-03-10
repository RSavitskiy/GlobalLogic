package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class TestFooter extends Main {
//    //    Footer footer = new Footer(driver);
//    Footer footer;


    @Test(priority = 1)
    public void testWatDoWeServices() {
        Footer footer = new Footer(driver);
        footer.clickWhatDoWeServices();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Що ми робимо - Послуги | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test(priority = 2)
    public void testOurProjects() throws InterruptedException {
        Footer footer = new Footer(driver);
        Thread.sleep(3000);
//       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        footer.clickOurProjects();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Наші роботи - Приклади | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test(priority = 2)
    public void testWhoWeAre() throws InterruptedException {
        Footer footer=new Footer(driver);
        Thread.sleep(3000);
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        footer.clickWhoWeAre();
        assertEquals(homePage.title.getAttribute("innerHTML"),"Хто ми - Про нас | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test (priority = 2)
    public void testNewsAndInsights() throws InterruptedException {

        Footer footer=new Footer(driver);
        Thread.sleep(3000);
        footer.clickNewsAndInsights();
        assertEquals(homePage.title.getAttribute("innerHTML"),"Новини &amp; Insights | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test(priority = 2)
    public void testWorkWithUs() throws InterruptedException {
        Footer footer=new Footer(driver);
        Thread.sleep(3000);
        footer.clickWerkWithUs();
        assertEquals(homePage.title.getAttribute("innerHTML"),"Топ ІТ-компанії України | GlobalLogic Ukraine");
        footer.backspace();
    }
    @Test(priority = 2)
    public void testContactUs() throws InterruptedException{
        Footer footer=new Footer(driver);
        Thread.sleep(3000);
        footer.clickContactUs();
        assertEquals(homePage.title.getAttribute("innerHTML"),"Зв'язатися з GlobalLogic | GlobalLogic Ukraine");
        footer.backspace();
    }



}
