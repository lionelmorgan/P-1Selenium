import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\lione\\IdeaProjects\\HelloSelenium\\edgedriver\\msedgedriver.exe"); //sets the location of the webdriver

        //creates an instance of the driver
        WebDriver driver = new EdgeDriver();

        //sends a request to retrieve this webpage
        driver.get("http://localhost:9000");
        Thread.sleep(2500); //this is to slow down how fast selenium does the automation

        //actually retrieving the webelement from the html page
        WebElement inputElem1 = driver.findElement(By.id("number1-input"));
        WebElement inputElem2 = driver.findElement(By.id("number2-input"));

        inputElem1.sendKeys("7");
        inputElem2.sendKeys("2");

        WebElement btn1 = driver.findElement(By.id("add-btn"));
        btn1.click();

        Thread.sleep(2500);

        //Subtraction
        WebElement inputElem3 = driver.findElement(By.id("number3-input"));
        WebElement inputElem4 = driver.findElement(By.id("number4-input"));

        double num3 = Math.random();
        double num4 = Math.random();
        inputElem3.sendKeys(String.valueOf(num3));
        inputElem4.sendKeys(String.valueOf(num4));

        WebElement btn2 = driver.findElement(By.id("sub-btn"));
        btn2.click();

        Thread.sleep(2500);

        //Multiplication
        WebElement inputElem5 = driver.findElement(By.id("number5-input"));
        WebElement inputElem6 = driver.findElement(By.id("number6-input"));

        int num5 = (int)(Math.random() * 101);
        int num6 = (int)(Math.random() * 101);
        inputElem5.sendKeys(String.valueOf(num5));
        inputElem6.sendKeys(String.valueOf(num6));

        WebElement btn3 = driver.findElement(By.id("mult-btn"));
        btn3.click();

        Thread.sleep(2500);

        //Division
        WebElement inputElem7 = driver.findElement(By.id("number7-input"));
        WebElement inputElem8 = driver.findElement(By.id("number8-input"));

        int num7 = (int)(Math.random() * 101);
        double num8 = Math.random() * 101;
        inputElem7.sendKeys(String.valueOf(num7));
        inputElem8.sendKeys(String.valueOf(num8));

        WebElement btn4 = driver.findElement(By.id("div-btn"));
        btn4.click();

        Thread.sleep(2500);

        driver.quit();


    }
}