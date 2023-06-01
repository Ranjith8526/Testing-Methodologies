package com.example.tasktwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class tasktwo {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		String url="https://demo.opencart.com/";
		//launch the url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		//Thread.sleep(3000);
		//to scroll down
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3800)", "");
		//returns
		WebElement returns = driver.findElement(By.linkText("Returns"));
		returns.click();
		driver.navigate().back();
		driver.quit();
    
	}
}
