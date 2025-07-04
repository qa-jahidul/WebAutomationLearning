import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{
    @Test
    public void interactWithElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement head = driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));

        String headText = head.getText();
        System.out.println(headText);

        //Click command
        WebElement radiobtn2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        radiobtn2.click();
        Thread.sleep(1000);

        WebElement name = driver.findElement(By.cssSelector("#name"));
        //sendKeys command
        name.sendKeys("Jahidul");
        Thread.sleep(1000);
        //Clear command
        name.clear();
        Thread.sleep(1000);
        //Get attribute
        String placeholderText = name.getAttribute("placeholder");
        System.out.println(placeholderText);
        Thread.sleep(1000);

        // Get Css value
        WebElement openTab = driver.findElement(By.cssSelector("#opentab"));
        String color = openTab.getCssValue("background-color");
        System.out.println(color);

        WebElement radioBtn1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        System.out.println("Btn1: " +radioBtn1.isSelected());
        System.out.println("Btn2: "+ radiobtn2.isSelected());

        WebElement show_hide_box = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println(show_hide_box.isDisplayed());

        driver.findElement(By.cssSelector("#hide-textbox")).click();
        System.out.println(show_hide_box.isDisplayed());

        WebElement checkBoxOption1 = driver.findElement(By.id("checkBoxOption1"));
        System.out.println("Checkbox status: "+ checkBoxOption1.isEnabled());
    }
}
