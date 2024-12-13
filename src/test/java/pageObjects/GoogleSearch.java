package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class GoogleSearch {

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    private WebElement searchBar;

    @FindBy(xpath = "//h3[normalize-space()='falabella.com | Compras online en solo lugar']")
    private WebElement falabellaPage;

    private void pageToSearch(String page){
        searchBar.sendKeys(page);
    }

    public void searchPage(String page){
        searchBar.click();
        pageToSearch(page);
        searchBar.sendKeys(Keys.ENTER);
    }

    public GoogleSearch(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

    /*/Enter text
    WebElement googleSearch = chromedriver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    //Search Adidas Us
        googleSearch.sendKeys("Falabella");
    //Press Enter
        googleSearch.sendKeys(Keys.ENTER);

    //Click at Falabella
        chromedriver.findElement(By.xpath("//h3[normalize-space()='falabella.com | Compras online en solo lugar']")).click();

    */