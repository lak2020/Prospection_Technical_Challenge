package testRunner;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MapViewPage;
import setup.Setup;

public class TestRunner extends Setup {
    BasePage basePage;
    MapViewPage mapViewPage;

    @Story("Story: Click Map view & verify Map with legends")
    @Description("T001_Verify whether user redirecting to correct weather page")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void verifyWeatherPage() {
        basePage = new BasePage(driver);
        mapViewPage = new MapViewPage(driver);
        basePage.searchingLocation();
        Assert.assertEquals(basePage.getweatherPageTitle(), "Barangaroo Weather (beta)");
    }

    @Story("Story: Click Map view & verify Map with legends")
    @Description("T002_Verify whether user searched name on the map")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void verifyMapPage() {
        basePage = new BasePage(driver);
        mapViewPage = new MapViewPage(driver);
        basePage.goingToMapView();
        Assert.assertEquals(mapViewPage.getMapPageTitle(), "Barangaroo");
    }

    @Story("Story: Click Map view & verify Map with legends")
    @Description("T003_Verify whether Legends popup showing after closing Forecast popup")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 3)
    public void verifyLegend() {
        mapViewPage = new MapViewPage(driver);
        mapViewPage.verifyLegend();
    }
}
