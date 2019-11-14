package table.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TablePage  {

    //Retrieve entire table
    @FindBy(how = How.CSS,using = ".w3-responsive")
    public WebElement tableElement1;

    //Reading 2nd row
    @FindBy(how = How.CSS,using = ".w3-responsive tr:nth-child(3)")
    public WebElement tableElement2;

    @FindBy(how = How.CSS,using = ".w3-responsive tr:nth-child(3) td:nth-child(7)")
    public WebElement tableElement3;

    public void getTableData1() {
        String tableData1 = tableElement1.getText();
        System.out.println(tableData1);
    }
    public void getTableData2() {
        String tableData2 = tableElement2.getText();
        System.out.println(tableData2);
    }
    public void getTableData3(){
        String tableData3 = tableElement3.getText();
        System.out.println(tableData3);
    }
}
