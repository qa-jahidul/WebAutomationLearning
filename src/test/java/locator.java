import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locator extends DriverSetup{

    @Test
    public void testLocators() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(1000);

        WebElement searchArea;
//        searchArea = driver.findElement(By.id("APjFqb"));
//        searchArea = driver.findElement(By.className("gLFyf"));
//        searchArea = driver.findElement(By.name("q"));
//        searchArea = driver.findElement(By.tagName("textarea"));
//        searchArea = driver.findElement(By.cssSelector("#APjFqb"));
        searchArea = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));


        searchArea.sendKeys("Bangladesh");
        Thread.sleep(2000);
    }
}
