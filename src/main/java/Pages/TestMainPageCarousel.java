//package Pages;
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//
//// Class don`t work (not finished)
//
//
//public class TestMainPageCarousel extends Main {
//
//    @Test (dataProvider = "button")
//    public void testWorkingButton(String button,String picture) throws InterruptedException {
//        MainPageCarousel mainPage = new MainPageCarousel(driver);
//        mainPage.workWithCarousel();
//    }
//
//    @DataProvider (name = "button")
//    public Object [][] buttonPicture(){
//        Object[][] buttonPicture=new Object[5][2];
//        buttonPicture[0][0]="1";
//        buttonPicture[0][1]=".//*[contains(@style,'GL_Linux')]";
//
//        buttonPicture[1][0]="2";
//        buttonPicture[1][2]=".//*[contains(@style,'LA-Galaxy')]";
//
//        buttonPicture[2][0]="3";
//        buttonPicture[2][1]=".//*[contains(@style,'avid-carousel')]";
//
//        buttonPicture[3][0]="4";
//        buttonPicture[3][1]=".//*[contains(@style,'harmonic')]";
//
//        buttonPicture[4][0]="5";
//        buttonPicture[4][1]=".//*[contains(@style,'research')]";
//
//        buttonPicture[5][0]="6";
//        buttonPicture[5][1]=".//*[contains(@style,'hero')]";
//        return buttonPicture;
//
//
//    }
//}
