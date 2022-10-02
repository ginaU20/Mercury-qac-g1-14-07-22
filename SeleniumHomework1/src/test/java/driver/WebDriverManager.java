package driver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    public static ChromeDriver getChromeDriveByManager(){
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
