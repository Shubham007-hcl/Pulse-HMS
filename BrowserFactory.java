package com.edureka.frameworkPackage;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
public class BrowserFactory {
 
public static WebDriver driver;
 
public BrowserFactory(){
 
}
 
public static WebDriver getDriver(){
if(driver==null){
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
options.setPageLoadStrategy(PageLoadStrategy.NONE);
System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
driver = new ChromeDriver(options);
driver.manage().window().maximize();
<a name="Login Page"</a>driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
}
return driver;
}