import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.OutputType.*;

public class NewBook {
    public static void main(String[] args) throws Exception {
    	
    	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\New\\chromedriver.exe");
    	
        ChromeDriver  wd;
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.facebook.com/");
        wd.findElement(By.id("u_0_c")).click();
        wd.findElement(By.id("u_0_c")).clear();
        wd.findElement(By.id("u_0_c")).sendKeys("Ha");
        wd.findElement(By.id("u_0_e")).click();
        wd.findElement(By.id("u_0_e")).clear();
        wd.findElement(By.id("u_0_e")).sendKeys("Sha");
        wd.findElement(By.id("u_0_h")).click();
        wd.findElement(By.id("u_0_h")).clear();
        wd.findElement(By.id("u_0_h")).sendKeys("6302349876");
       // wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
