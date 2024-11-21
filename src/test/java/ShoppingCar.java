import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.security.PublicKey;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ShoppingCar {
    protected WebDriver chromedriver;

    @Before
    public void openDriver(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);
        //New Web instance
        chromedriver = new ChromeDriver();
        //Waiting time to let time to charge page
        chromedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void doPurchase(){

        //Open Google
        chromedriver.get("https://www.google.com");

        //Enter text
       WebElement googleSearch = chromedriver.findElement(By.xpath("//textarea[@id='APjFqb']"));
       //Search Adidas Us
        googleSearch.sendKeys("Adidas Us");
        //Press Enter
        googleSearch.sendKeys(Keys.ENTER);

        //Click at Adidas Us
        chromedriver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb N8QANc Va3FIb EE3Upf'] span")).click();

        //Create a Explicid wait
        WebDriverWait wait = new WebDriverWait(chromedriver,Duration.ofSeconds(10));

        //Waiting until the element apear
        WebElement searchbottom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        //Write the shoes reference
        searchbottom.sendKeys("Forum");
        //Press ENTER
        searchbottom.sendKeys(Keys.ENTER);
        //Click on shoes reference
        WebElement shoesRef = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@class='product-card_product-card__a9BIh product-grid_product-card__8ufJk product-card_hover__XyMMs']//img[2]")));
        shoesRef.click();

    }

    @After
    public void closeDriver(){
    //Close Driver
        chromedriver.quit();
    }
}
