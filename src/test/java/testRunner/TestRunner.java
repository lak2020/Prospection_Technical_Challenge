package testRunner;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.MapViewPage;
import setup.Setup;

public class TestRunner extends Setup {
    BasePage basePage;
    MapViewPage mapViewPage;

    @Test
    public void verifyMapWithLegend() {
        basePage = new BasePage(driver);
        mapViewPage = new MapViewPage(driver);

        basePage.searchingLocation();
        basePage.goingToMapView();
        mapViewPage.verifyLegend();
    }
}
