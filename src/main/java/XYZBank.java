import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class XYZBank {
    WebDriver driver;
    String path;

    public XYZBank(String path) {
        this.path = path;
        setPrep(this.path);
    }

    public void setPrep(String path) {
            System.setProperty("webdriver.chrome.driver",path); // SetDriver
            this.driver = new ChromeDriver();
            this.driver.manage().timeouts().implicitlyWait(20, SECONDS);
            this.driver.manage().window().maximize();
            this.driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }



    public String openpage (String url){
        this.driver.get(url);
        return this.driver.getCurrentUrl();
    }

    public void close(){
        this.driver.quit();
    }

    public String managerLogin(){
        this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button"));
        return driver.getCurrentUrl();
    }

    public String  openAccount() throws InterruptedException {
        this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button")).click();
        this.driver.manage().timeouts().implicitlyWait(1, SECONDS);
        this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")).click();
        this.driver.findElement(By.cssSelector("#userSelect > option:nth-child(3)")).click();
        this.driver.findElement(By.cssSelector("#currency > option:nth-child(2)")).click();
        this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > button")).click();
        WebElement actLable = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > label"));
        return actLable.getText();

    }

    public void homepage(){
        this.driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

    }

}
