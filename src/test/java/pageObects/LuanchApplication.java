package pageObects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LuanchApplication {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Successfully launched the application");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("hello google");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        // Wait until the suggestions are visible
        List<WebElement> searchedOptions=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li[@role='presentation']")));
//        List<WebElement> searchedOptions = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
            
        for(WebElement printalloptions:searchedOptions) {
        	System.out.println("Print all Options: " + printalloptions.getText());
        }
        
               boolean insideIf=false;
            for (WebElement option : searchedOptions) {
                String textoftheoption = option.getText();
//                System.out.println("Option: " + textoftheoption);
                if (textoftheoption.equalsIgnoreCase("hello google i love u")) {
                	System.out.println("Print the selected options:- " + option.getText());
                    option.click();
                    insideIf=true;
                    System.out.println("Clicked on the option");
                    break;
                }
            }
            if(!insideIf) {
            	System.out.println("its not went inside the if condition block");
            }else {
            	System.out.println("its went inside: success");
            }
            // Re-fetch the list if elements are stale
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));
        }
//        driver.quit();
    }