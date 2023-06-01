package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("sample");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("B");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("hgjhdmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Ranjith123#");
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div")).click();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollno(0,1500)","");
        
        
    }
}
