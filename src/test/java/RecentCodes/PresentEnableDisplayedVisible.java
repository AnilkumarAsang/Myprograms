package RecentCodes;


	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

	public class PresentEnableDisplayedVisible {
	    public static void main(String[] args) {
	        // Set up WebDriver
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    	WebDriverManager.chromiumdriver().setup();
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open the Login Page
	        	driver.get("file:///C:/Users/Admin/Desktop/Test/LoginScreenDemo.html");
	        	

//	            C:\Users\Admin\Desktop\Test.html

	            // Define locators
	            By usernameField = By.id("username");
	            By passwordField = By.id("password");
	            By loginButton = By.id("loginButton");

	            // Example 1: Check if elements are present
	            System.out.println("Checking if elements are present...");
	            try {
	                driver.findElement(usernameField);
	                driver.findElement(passwordField);
	                driver.findElement(loginButton);
	                System.out.println("All elements are present in the DOM.");
	            } catch (NoSuchElementException e) {
	                System.out.println("One or more elements are not present.");
	            }

	            // Example 2: Check if elements are visible
	            System.out.println("Checking if elements are visible...");
	            WebElement username = driver.findElement(usernameField);
	            WebElement password = driver.findElement(passwordField);
	            WebElement login = driver.findElement(loginButton);

	            if (username.isDisplayed() && password.isDisplayed() && login.isDisplayed()) {
	                System.out.println("All elements are visible.");
	            } else {
	                System.out.println("One or more elements are not visible.");
	            }

	            // Example 3: Check if elements are enabled
	            System.out.println("Checking if elements are enabled...");
	            if (username.isEnabled() && password.isEnabled()) {
	                System.out.println("Username and Password fields are enabled.");
	            }

	            if (!login.isEnabled()) {
	                System.out.println("Login button is disabled (as expected).");
	            }

	            // Example 4: Interact and enable the Login button
	            System.out.println("Interacting with form to enable the Login button...");
	            username.sendKeys("testUser");
	            password.sendKeys("testPassword");

	            // Wait for the button to become enabled
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.elementToBeClickable(login));

	            if (login.isEnabled()) {
	                System.out.println("Login button is now enabled.");
	            }

	            // Example 5: Verify Login button visibility using JavaScript
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            String display = (String) js.executeScript("return window.getComputedStyle(arguments[0]).display;", login);
	            String visibility = (String) js.executeScript("return window.getComputedStyle(arguments[0]).visibility;", login);

	            if (!"none".equals(display) && !"hidden".equals(visibility)) {
	                System.out.println("Login button is visible via JavaScript check.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
//	            driver.quit();
	        }
	    }
	}

