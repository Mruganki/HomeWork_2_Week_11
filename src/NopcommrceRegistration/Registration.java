package NopcommrceRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Registration{
     static WebDriver driver;

        public static void main(String[] args) {


                String baseUrl = "https://demo.nopcommerce.com/";
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);//it will wait to load browser
                driver.get(baseUrl);

                driver.findElement(By.xpath("//a[@class='ico-register']")).click();
                driver.findElement(By.xpath("//input[@id='gender-female']")).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@id='FirstName' and @name='FirstName']")).click();
            driver.findElement(By.xpath("//input[@id='FirstName' and @name='FirstName']")).sendKeys("Prime");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@id='LastName' and @name= 'LastName']")).click();
            driver.findElement(By.xpath("//input[@id='LastName' and @name= 'LastName']")).sendKeys("Testing");
            driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("15");
            driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']")).sendKeys("December");
            driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']")).sendKeys("1987");
            driver.findElement(By.xpath("//input[@id ='Email' and @name='Email']")).sendKeys("abc324@gmail.com");
            driver.findElement(By.xpath("//input[@id='Company' and @name='Company']")).sendKeys("Abc Ltd");
            driver.findElement(By.xpath("//input[@id='Password' and @name='Password']")).sendKeys("nothing123");
            driver.findElement(By.xpath("//input[@id='ConfirmPassword' and @name='ConfirmPassword']")).sendKeys("nothing123");
            driver.findElement(By.xpath("//button[@id='register-button' and @name= 'register-button']")).click();

             driver.quit();



        }

}
