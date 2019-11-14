package amazonhome;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends CommonAPI {


    /*public void testSearchTextBox(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.cssSelector(".nav-input")).click();
    }*/

    @Test
    public void test1(){
        typeOnElement("//input[@id='twotabsearchtextbox']","iphone");
        clickOnElement(".nav-input");
    }


}
