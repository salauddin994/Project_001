package Stepdef;

import Base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {

    // url and browser setup
    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    // open browser
    @Before
    public void openBrowser(){
        // default code
        if (Strings.isNullOrEmpty(browserType)){
            browserType="ch";
        }
        if (Strings.isNullOrEmpty(baseURL)){
            baseURL="stage";
        }
        // main setup
        driver = initDriver(browserType);
        switch (baseURL){
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "prod":
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);

    }


    @After
    public void tearDown(){

        driver.quit();
    }

}
