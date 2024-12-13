package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResult {

    @FindBy(xpath = "//h3[normalize-space()='falabella.com | Compras online en solo lugar']")
    private WebElement resultPage;

    public void clickResultPage(){
        resultPage.click();
    }

    public GoogleResult(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
