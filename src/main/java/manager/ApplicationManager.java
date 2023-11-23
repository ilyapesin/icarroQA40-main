package manager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    UserHelper userHelper;

    public void init() {
        driver = new ChromeDriver();
        userHelper = new UserHelper(driver);
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public void tearDown() {
        driver.quit();
    }

}
