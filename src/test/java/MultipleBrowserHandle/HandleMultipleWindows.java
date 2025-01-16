package MultipleBrowserHandle;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

	public class HandleMultipleWindows {
	    public static void main(String[] args) throws InterruptedException {
	        // Set the path for the ChromeDriver
	        WebDriverManager.chromedriver().setup();

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the main page
	        driver.get("https://google.com");
	        driver.manage().window().maximize();
	        System.out.println("Main window title: " + driver.getTitle());

	        // Click on a link that opens a new tab/window
//	        WebElement link = driver.findElement(By.linkText("Some Link")); // Update with a valid link text
//	        link.click();
	     // Open a new tab using JavaScript
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.open('https://facebook.com', 'blank');");


	        // Get the current window handle (main window)
	        String mainWindow = driver.getWindowHandle();

	        // Get all window handles
	        Set<String> allWindows = driver.getWindowHandles();

	        // Loop through all handles and switch to the new one
	        for (String window : allWindows) {
	            if (window.equals(mainWindow)) {
	                driver.switchTo().window(window);
	                System.out.println("Switched to new window. Title: " + driver.getTitle());
	                break;
	            }
	        }

	        // Perform some actions in the new tab/window
//	        driver.findElement(By.name("q")).sendKeys("Hello, new tab!");
//	        driver.findElement(By.name("q")).submit();

	        // Switch back to the main window
	        driver.switchTo().window(mainWindow);
	        System.out.println("Switched back to main window. Title: " + driver.getTitle());

	        // Close all windows
//	        driver.quit();
	    }
	}

