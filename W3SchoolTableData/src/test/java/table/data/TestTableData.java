package table.data;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import table.page.TablePage;

public class TestTableData extends CommonAPI {

    @Test
    public void scrapeTable(){
        TablePage tablePage = PageFactory.initElements(driver,TablePage.class);
        tablePage.getTableData1();
        tablePage.getTableData2();
        tablePage.getTableData3();
    }
}
