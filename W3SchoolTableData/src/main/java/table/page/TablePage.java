package table.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TablePage  {

    //Retrieve entire table
    /*@FindBy(how = How.CSS,using = ".w3-responsive")
    public WebElement tableElement;*/

    //Reading 2nd row
    /*@FindBy(how = How.CSS,using = ".w3-responsive tr:nth-child(3)")
    public WebElement tableElement;*/

    @FindBy(how = How.CSS,using = ".w3-responsive tr:nth-child(3) td:nth-child(7)")
    public WebElement tableElement;

    public void getTableData(){
        String tableData = tableElement.getText();
        System.out.println(tableData);
    }


}
