package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
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
        Footer footer = new Footer(driver);
        Thread.sleep(3000);
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        footer.clickWhoWeAre();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Хто ми - Про нас | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test(priority = 2)
    public void testNewsAndInsights() throws InterruptedException {

        Footer footer = new Footer(driver);
        Thread.sleep(3000);
        footer.clickNewsAndInsights();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Новини &amp; Insights | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test(priority = 2)
    public void testWorkWithUs() throws InterruptedException {
        Footer footer = new Footer(driver);
        Thread.sleep(3000);
        footer.clickWerkWithUs();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Топ ІТ-компанії України | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test(priority = 2)
    public void testContactUs() throws InterruptedException {
        Footer footer = new Footer(driver);
        Thread.sleep(3000);
        footer.clickContactUs();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Зв'язатися з GlobalLogic | GlobalLogic Ukraine");
        footer.backspace();
    }

    @Test(priority = 2, dataProvider = "languageTitle")
    public void testGlobalNavigation(String language, String title) throws InterruptedException {
        Footer footer = new Footer(driver);
        Thread.sleep(3000);
        assertEquals(footer.forGlobal(language), title);
    }


    @DataProvider(name = "languageTitle")
    public Object[][] languageTitle() {
        Object[][] languageTitle = new Object[5][2];
        languageTitle[0][0] = "Global";
        languageTitle[0][1] = "Digital Product Engineering Services";

        languageTitle[1][0] = "Latam";
        languageTitle[1][1] = "Desarrollo de software personalizado en Argentina";

        languageTitle[2][0] = "Ukraine";
        languageTitle[2][1] = "Розробка програмного забезпечення Компанія в Україні";

        languageTitle[3][0] = "Poland";
        languageTitle[3][1] = "Software Development Company in poland";

        languageTitle[4][0] = "Israel";
        languageTitle[4][1] = "Full-Lifecycle Product Development Services Provider Israel";
        return languageTitle;
    }


}
