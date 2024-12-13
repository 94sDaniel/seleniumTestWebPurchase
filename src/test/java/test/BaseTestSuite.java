package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.GoogleResult;
import pageObjects.GoogleSearch;
import pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

     WebDriver chromedriver;

     MainPage mainpage;
     GoogleSearch googleSearch;
     GoogleResult googleResult;

     private void initPage(WebDriver driver){
        mainpage = new MainPage(driver);
        googleSearch = new GoogleSearch(driver);
        googleResult = new GoogleResult(driver);
    }

    @Before
    public void openDriver(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);
        //New Web instance
        chromedriver = new ChromeDriver();
        //Waiting time to let time to charge page
        chromedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        initPage(chromedriver);
    }

    @After
    public void closeDriver(){
        //Close Driver
        chromedriver.quit();
    }
}
