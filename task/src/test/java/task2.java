import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        // Setup seleniumchromedriver
        System.setProperty("webdriver.chrome.driver", "D:/PERKULIAHAN the love love/Bootcamp QA/Web Driver Selenium/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Setup link website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // radio button
        driver.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        // Suggession Class Example
        driver.findElement(By.id("autocomplete")).sendKeys("Indonesia");
        Thread.sleep(1000);
        // dropdown 
        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Option2");
        dropdown.selectByVisibleText("Option1");
        Thread.sleep(1000);
        // checkbox
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.name("checkBoxOption3")).click();
        Thread.sleep(1000);
        // open window
        driver.findElement(By.id("openwindow")).click();
        driver.close();
        // switch tab
        driver.findElement(By.className("btn-style class1 class2")).click();
        driver.close();
        // switch to alert
        driver.findElement(By.id("name")).sendKeys("Yuni Yustina Siagian");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("Yuni Yustina Siagian");
        driver.findElement(By.id("confirmbtn")).click();

        // element displayed
        driver.findElement(By.id("hide-textbox")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("show-textbox")).click();
        driver.findElement(By.name("show-hide")).sendKeys("yuni siagian");

        // mouse hover
        driver.findElement(By.linkText("Reload")).click();
        
        Thread.sleep(2000);
        driver.close();
    }
}
