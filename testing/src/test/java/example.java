package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution {
    @Test
    public void test() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.coursera.org");
        driver.findElement(By.id("login_field")).sendKeys("2000032282@kluniversity.in");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();



        driver.findElement(By.name("password")).sendKeys("welcome");

        driver.findElement(By.className("header-logo"));


        driver.findElement(By.name("password")).sendKeys("welcome");

        driver.findElement(By.className("header-logo"));

        driver.findElement(By.linkText("Forgot password?")).click();

        driver.findElement(By.partialLinkText("Create an account")).click();
        driver.findElement(By.tagName("h1"));


    }


}