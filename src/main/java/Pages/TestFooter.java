package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestFooter extends Main {


    @Test
    public void testWatDoWeServices() {

        Footer footer = new Footer(driver);
        footer.clickWhatDoWeServices();
        assertEquals(homePage.title.getAttribute("innerHTML"), "Що ми робимо - Послуги | GlobalLogic Ukraine");
    }


}
