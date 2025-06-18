import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdownWithSelect extends DriverSetup{
    @Test
    public void interactWithDropdown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectElement);

        selectElement.click();
        Thread.sleep(3000);

        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByVisibleText("Option3");
        Thread.sleep(2000);
    }
}
