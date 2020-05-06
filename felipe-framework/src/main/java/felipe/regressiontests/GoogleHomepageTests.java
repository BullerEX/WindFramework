package felipe.regressiontests;

import felipe.framework.core.BaseTest;
import felipe.pageobjects.homepage.GoogleHomePage;
import org.testng.annotations.Test;

public class GoogleHomepageTests extends BaseTest {

    @Test
    public void homepageTests() {
        GoogleHomePage googleHomepage = new GoogleHomePage(getDriver());
    }
}