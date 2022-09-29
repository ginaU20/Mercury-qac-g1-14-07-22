package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class WebTableTests {

    public static void main(String[] args) {

        ChromeDriver driver = WebDriverManager.createChromeDriver();
               testWebTable(driver);
          testDynamicWebTable(driver);


        driver.quit();
    }

    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        return driver;

    }

    public static void testWebTable(ChromeDriver driver) {
        getTableDetails(driver);
    }

    public static void testDynamicWebTable(ChromeDriver driver) {
        updateTable(driver);
    }


    public static void getTableDetails(ChromeDriver driver){
        WebElement tableCaption = driver.findElement(By.cssSelector(" #tablehere table caption"));
        System.out.println(tableCaption.getText());
        System.out.println(" ");

        //select table columns and raw
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#tablehere table tr"));
        for(int i = 0 ; i < tableRows.size() ; i ++ ){
            WebElement currentRow = tableRows.get(i);
            if(i == 0){

                List<WebElement> firstRowColuumns = currentRow.findElements(By.cssSelector("th"));
                System.out.println("Header din prima coloana:" + firstRowColuumns.get(0).getText());
                System.out.println("Header din a doua coloana:" + firstRowColuumns.get(1).getText());
                System.out.println(" ");
            }else {
               List<WebElement> currentColumns = currentRow.findElements(By.cssSelector("td"));
                System.out.println("Text din randul " + (i + 1) + ", coloana 1: " + currentColumns.get(0).getText() );
                System.out.println("Text din randul " + (i + 1) + ", coloana 2: " + currentColumns.get(1).getText() );
                System.out.println(" ");

            }
        }



//
//        WebElement firstRow = tableRows.get(0);
//        List<WebElement> firstRowColuumns = firstRow.findElements(By.cssSelector("th"));
//        System.out.println("Header din prima coloana:" + firstRowColuumns.get(0).getText());
//        System.out.println("Header din a doua coloana:" + firstRowColuumns.get(1).getText());
//        System.out.println(" ");
//
//
//        WebElement secondRow = tableRows.get(1);
//        List<WebElement> secondRowColumns = secondRow.findElements(By.cssSelector("td"));
//        System.out.println("Text din randul 2 ,coloana 1:" + secondRowColumns.get(0).getText()) ;
//        System.out.println("Text din randul 2 ,coloana 2:" + secondRowColumns.get(1).getText());
//        System.out.println(" ");
//
//
//        WebElement thirdRow = tableRows.get(2);
//        List<WebElement> thirdRowColumns = thirdRow.findElements(By.cssSelector("td"));
//        System.out.println("Text din randul 3, coloana 1:" + thirdRowColumns.get(0).getText());
//        System.out.println("Text din randul 3, coloana 2:" + thirdRowColumns.get(1).getText());
//        System.out.println(" ");


    }




    public static void updateTable(ChromeDriver driver){


        WebElement summary = driver.findElement(By.cssSelector("details summary"));
        summary.click();


        //update caption

        WebElement caption = driver.findElement(By.id("caption"));
        caption.clear();
        caption.sendKeys("Text introdus la lectie");

        //update table id

        WebElement tableId = driver.findElement(By.id("tableid"));
        tableId.clear();
        tableId.sendKeys("customId");

        //press refresh button

        WebElement refreshTableButton = driver.findElement(By.id("#refreshtable"));
        refreshTableButton.click();


        WebElement tableCaption = driver.findElement(By.cssSelector("#tablehere table caption"));
        System.out.println(tableCaption.getText());
        System.out.println(" ");


        WebElement table = driver.findElement(By.cssSelector("#tablehere table"));
        System.out.println(table.getAttribute("id"));



    }
}
