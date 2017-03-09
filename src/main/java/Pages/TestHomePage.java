package Pages;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestHomePage extends Main {

    @Test
    public void testLogo() {
        assertTrue(homePage.logo.isDisplayed());
    }

    @Test
    public void testTitle() {
        assertEquals(homePage.title.getAttribute("innerHTML"), "Розробка програмного забезпечення Компанія в Україні");
    }


}
