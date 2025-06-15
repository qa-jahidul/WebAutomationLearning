import org.testng.annotations.Test;

public class HandleBrowserRelatedTask extends DriverSetup {
    @Test
    public void testBrowserTask() throws InterruptedException {
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("URL: "+ url);

        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.manage().window().minimize();
        Thread.sleep(3000);



    }

}
