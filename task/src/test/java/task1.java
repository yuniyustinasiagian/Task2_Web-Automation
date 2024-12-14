import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup seleniumchromedriver
        System.setProperty("webdriver.chrome.driver", "D:/PERKULIAHAN the love love/Bootcamp QA/Web Driver Selenium/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Setup link website
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //Simulation of form filling
        driver.findElement(By.name("name")).sendKeys("Yuni Yustina Siagian");
        driver.findElement(By.name("email")).sendKeys("yunisiagian30@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("yuni12345");
        driver.findElement(By.id("exampleCheck1")).click();
        // dropdown
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown); 
        dropdown.selectByVisibleText("Female");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        // radio button
        driver.findElement(By.id("inlineRadio1")).click();
        // create calender
        WebElement dateInput = driver.findElement(By.name("bday"));
        dateInput.sendKeys("05-30-2003");
        Thread.sleep(2000);
        Thread.sleep(2000);
        // click button submit
        WebElement submitButton = driver.findElement(By.cssSelector("input.btn.btn-success[type='submit']"));
        submitButton.click();
        Thread.sleep(2000);
        // success message
        WebElement successMessage = driver.findElement(By.cssSelector("a.close[aria-label='close']"));
        // get message from successMessage
        String messageText = successMessage.getText();
        System.out.println("Success Message: " + messageText);

        Thread.sleep(2000);
        driver.close();
    }
}
