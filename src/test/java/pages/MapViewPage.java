package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapViewPage {
    WebDriver driver;
    @FindBy(id = "ext-gen650")
    WebElement closeForecast;
    @FindBy(id = "legendWin")
    WebElement lblLegend;

    public MapViewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyLegend() {
        closeForecast.click();
        lblLegend.isDisplayed();
    }
}
