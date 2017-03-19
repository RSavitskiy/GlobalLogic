
import Pages.Main;
import Pages.MainPage;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class TestMainPage extends Main {
    MainPage mainPage;


    @Test
    public void testButtonService() throws InterruptedException {
        mainPage = new MainPage(driver);
//        Thread.sleep(3000);
        mainPage.clickButtonService();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Що ми робимо - Послуги | GlobalLogic Ukraine");
        mainPage.backspace();
    }

    @Test
    public void testButtonPractices() throws InterruptedException {
        mainPage = new MainPage(driver);
//        Thread.sleep(2000);
        mainPage.clickButtonPractices();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Практики розробки ПЗ | GlobalLogic Ukraine");
        mainPage.backspace();
    }

    @Test
    public void testWhoWeAre() throws InterruptedException {
        mainPage = new MainPage(driver);
//        Thread.sleep(2000);
        mainPage.clickButtonIndustries();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Програми для роздрібної торгівлі, мультимедіа, зв'язку, медицини, автопромисловості | GlobalLogic Ukraine");
        mainPage.backspace();
    }
//????
    @Test
    public void testButtonClientGrid() throws InterruptedException {
        mainPage = new MainPage(driver);
        Thread.sleep(5000);
        mainPage.clickButtonClientGrid();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Хто ми - Про нас | GlobalLogic Ukraine");
        mainPage.backspace();
    }

    @Test
    public void testLaGalaxyPicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
       assertTrue(mainPage.isDisplayedLaGalaxyPicture());

    }

    @Test
    public void testHarmoticPicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedHarmoticPicture());
    }

    @Test
    public void testResearchPicuare() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedResearchPicuare());
    }

    @Test
    public void testEconomistPicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedEconomistPicture());
    }

    @Test
    public void testInstabeatPicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedInstabeatPicture());
    }

    @Test
    public void testStellarPicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedStellarPicture());
    }

    @Test
    public void testBayInnovationPicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedBayInnovationPicture());
    }
    @Test
    public void testCochlearPicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedCochlearPicture());
    }

    @Test
    public void testSeeMorePicture() throws InterruptedException {
        mainPage=new MainPage(driver);
//        Thread.sleep(3000);
        assertTrue(mainPage.isDisplayedSeeMorePicture());
    }

    @Test
    public void testButtonNewsAndInsightsButton() throws InterruptedException {
        mainPage = new MainPage(driver);
//        Thread.sleep(3000);
        mainPage.clickButtonNewsAndInsightsButton();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Новини & Insights | GlobalLogic Ukraine");
        mainPage.backspace();
    }

    @Test
    public void testButtonWorkWithUsButton() throws InterruptedException {
        mainPage = new MainPage(driver);
//        Thread.sleep(3000);
        mainPage.clickButtonWorkWithUsButton();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Топ ІТ-компанії України | GlobalLogic Ukraine");
        mainPage.backspace();
    }


//    @TestClass
//    public void testShareLinkedin() throws InterruptedException {
//        mainPage =new MainPage(driver);
//        mainPage.clickLinkedIn();
//        Thread.sleep(3000);
//        assertEquals(mainPage.shareLinkedin(),"Войти в LinkedIn");
//
//    }

//    Add share linkedin? twitter and facebook

}
