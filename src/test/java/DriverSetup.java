import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    public WebDriver driver;

    public void startBrowser(){
        driver = new ChromeDriver();
    }
    public void closeBrowser(){
        driver.close();
    }
}
