package tek.bdd.steps;

import org.junit.Before;

public class Hooks extends SeleniumUtility{

    @Before
    public void setUpTests(){
        openBrowser();
    }

    public void cleanUpTests() {
        driverQuit();
    }
}
