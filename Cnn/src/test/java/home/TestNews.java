package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNews extends CommonAPI {

    @Test
    public void test1(){
        driver.findElement(By.cssSelector(".nav-linksstyles__Link-sc-1tike8v-0 nav-linksstyles__SectionLink-sc-1tike8v-4 cXrxeG")).click();
    }
}
