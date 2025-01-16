package RecentCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.Set;

public class MultipleTabs {
    public static void main(String[] args) {
        // Set up the WebDriver (Chrome in this case)
        WebDriverManager.chromedriver().setup();
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Load the local HTML file that opens multiple tabs
            driver.get("file:///C:/Users/Admin/Desktop/Test/Multiple.html"); // Replace with your actual HTML file path

            // Locate and click the button that opens the multiple tabs
            WebElement button = driver.findElement(By.tagName("button"));
            button.click();

            // Wait for a brief moment to ensure all tabs open
            Thread.sleep(2000);  // You can adjust this time if needed

            // Get all window handles (tabs)
            Set<String> windowHandles = driver.getWindowHandles();
            ArrayList<String> tabs = new ArrayList(windowHandles);

            // Loop through each tab and perform actions
            for (int i = 0; i < tabs.size(); i++) {
                driver.switchTo().window(tabs.get(i));  // Switch to the tab

                // Print the title and URL of the current tab
                System.out.println("Tab " + (i + 1) + " Title: " + driver.getTitle());
                System.out.println("Tab " + (i + 1) + " URL: " + driver.getCurrentUrl());

                // Perform additional actions on the tab if needed
            }

            // Switch back to the first tab (index 0)
            driver.switchTo().window(tabs.get(0));

            // Close the third tab (if open)
            if (tabs.size() > 2) {
                try {
                	 System.out.println("Tab  Title: " + driver.getTitle());
                    driver.switchTo().window(tabs.get(2));  // Switch to the third tab
                    driver.close();  // Close the third tab
                    tabs.remove(2);  // Remove it from the list of open tabs
                    System.out.println("Closed Tab 3");
                } catch (NoSuchWindowException e) {
                    System.out.println("No such window exception while closing tab 3");
                }
            }

            // Switch back to the first tab
            driver.switchTo().window(tabs.get(0));
            System.out.println("Switched back to the first tab: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the driver and all open tabs
            driver.quit();
        }
    }
}
