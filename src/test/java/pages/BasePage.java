package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    @FindBy(id = "location-search-box")
    WebElement fieldChangeLocation;
    @FindBy(xpath = "//a[contains(text(),'Barangaroo, NSW 2000')]")
    WebElement desiredItem;
    @FindBy(className = "meteye-link")
    WebElement linkMapView;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchingLocation() {
        fieldChangeLocation.sendKeys("2000");
        desiredItem.click();
    }

    public void goingToMapView() {
        linkMapView.click();
    }
}
