package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class PlaceOrderPage extends TestBase{
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	

	// *[@id="container"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button
	public void validatePlaceOrderPage() {

		wait(2000);
		//System.out.println("Title in Add to cart: " + driver.getTitle());
		
		By PlaceOrder = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/form/button/span");

		WebElement PlaceOrderButton = driver.findElement(PlaceOrder);
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span")).getText());

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", PlaceOrderButton);

		wait(2000);
//		PlaceOrderButton.click();

		driver.findElement(PlaceOrder).click();
	}



}
