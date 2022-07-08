package com.flipkart.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class SelectProductPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	By fistLaptopLoc = By
			.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]");

	public boolean validateSelectProduct() {

		driver.findElement(fistLaptopLoc).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> totalWindows = driver.getWindowHandles();

		boolean flagResult = true;

		for (String obj : totalWindows) {

			if (!obj.endsWith(parentWindow)) {

				driver.switchTo().window(obj);

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Compare']")));
				} catch (TimeoutException te) {
					captureScreenshot("Search Product Failure");
					flagResult = false;
				}
			}

		}

		if (flagResult) {
			String actResult = driver.findElement(By.xpath("//*[text()='Compare']"))
					.getText();
			return actResult.equals("Compare");
		} else
			return false;

	}
}



