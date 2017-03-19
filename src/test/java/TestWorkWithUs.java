package java;

import Pages.Main;
import Pages.WorkWithUs;
import org.testng.annotations.Test;

public  class TestWorkWithUs extends Main {



    @Test
    public void SelectionOfPosition() throws InterruptedException {
        WorkWithUs workWithUs=new WorkWithUs(driver);
        driver.get("https://www.globallogic.com/ua/work-with-us/");
        workWithUs.selectAll();
        workWithUs.clickSearch();
        Thread.sleep(2000);
        workWithUs.countVacancies();
    }
}
