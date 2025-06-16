# 🟦 3. Prompt:
 
Write a Selenium WebDriver script in Java to log into a website.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginTest {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://example.com/login");

    driver.findElement(By.id("username")).sendKeys("mahrukh");
    driver.findElement(By.id("password")).sendKeys("test123");
    driver.findElement(By.id("loginBtn")).click();

    System.out.println("Login Test Completed!");
    driver.quit();
  }
}
