package MultipleBrowserHandle;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBetweenTabs {
    public static void main(String[] args) {
        // Set up WebDriver
    	
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Open the first URL in the first tab (Google)
        driver.get("https://www.google.com");
        System.out.println("Title of the main tab: " + driver.getTitle());
        // Use JavascriptExecutor to open new tabs
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 3; i++) {
            // Open a new tab for each URL
            String[] urls = {"https://www.flipkart.com", "https://www.amazon.com", "https://www.facebook.com"};
            js.executeScript("window.open('" + urls[i] + "', '_blank');");
        }

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        
        // Store the handle of the main (first) tab
        String mainWindowHandle = driver.getWindowHandle();
        
        // Switch to each tab and get its title
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {  // Skip the main tab
                driver.switchTo().window(handle);
                System.out.println("Title of the tab: " + driver.getTitle());
                driver.close();
            }
        }

        // Switch back to the main tab
//        driver.switchTo().window(mainWindowHandle);
        System.out.println("Back to the main tab with title: " + driver.getTitle());
       
        // Close the browser
//        driver.quit();
    }
}
