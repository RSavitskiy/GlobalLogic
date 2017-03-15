package Pages;

import org.testng.annotations.Test;



public class TestWorkWithUs extends Main{



    @Test
    public void SelectionOfPosition(){
        WorkWithUs workWithUs=new WorkWithUs(driver);
        workWithUs.selectAll();
        workWithUs.clickSearch();
    }



}
