package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(className = "SearchBar-module_searchBar__Input__1kPKS")
    private WebElement bottomSearch;

    private void anyPage (String article){
        bottomSearch.sendKeys(article);
    }

    public void searchObject(String article){
        bottomSearch.click();
        anyPage(article);
        bottomSearch.sendKeys(Keys.ENTER);
    }
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
