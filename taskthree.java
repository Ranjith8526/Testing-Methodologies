package com.example.taskthree;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskthree 
{
    public static void main( String[] args )
    {

           WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url ="https://mail.rediff.com/cgi-bin/login.cgi/";
        //launch the url
        driver.get(url);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String current_url=driver.getCurrentUrl();
        System.out.println(title+""+current_url);
        WebElement username = driver.findElement(By.xpath("//*[@id=\"login1\"]"));
        username.sendKeys("sample");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("pass");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"remember\"]"));
//        checkbox.click();
//        if(!checkbox.isSelected())
//        {
//        	checkbox.click();
//        	System.out.println("clicked");
//        }
        System.out.println(checkbox.isSelected());
        driver.quit();
    }
}