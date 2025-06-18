import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleDropdownWithSelect extends DriverSetup{
    @Test
    public void interactWithDropdown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectElement);

        selectElement.click();
        Thread.sleep(1000);

        //select by index
        select.selectByIndex(2);
        Thread.sleep(1000);
        //select by visible text
        select.selectByVisibleText("Option3");
        Thread.sleep(1000);
        //select by value
        select.selectByValue("option1");
        Thread.sleep(1000);
        // Get first select option
        WebElement selected_option = select.getFirstSelectedOption();
        System.out.println(selected_option.getText());
        //Get all selected options
        List<WebElement> all_options = select.getOptions();
        System.out.println(all_options.size());
        for(WebElement option: all_options){
            System.out.println(option.getText());
        }




    }
}
