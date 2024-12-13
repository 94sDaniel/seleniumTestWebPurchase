package test;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class ShoppingCar extends BaseTestSuite{

    @Test
    public void doPurchase(){

        //Open Google
        chromedriver.get("https://www.google.com");

        googleSearch.searchPage("falabella");

        googleResult.clickResultPage();

        mainpage.searchObject("adidas");
        /*//Waiting until the element apear
        WebElement searchbottom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        //Write the shoes reference
        searchbottom.sendKeys("Forum");
        //Press ENTER
        searchbottom.sendKeys(Keys.ENTER);
        //Click on shoes reference
        WebElement shoesRef = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@class='product-card_product-card__a9BIh product-grid_product-card__8ufJk product-card_hover__XyMMs']//img[2]")));
        shoesRef.click();*/

    }

}

//Create a Explicid wait
//  WebDriverWait wait = new WebDriverWait(chromedriver, Duration.ofSeconds(10));