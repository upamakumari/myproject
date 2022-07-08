package com.flipkart.testscenarios;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.AddtoCartPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.PlaceOrderPage;
import com.flipkart.pages.SearchProductPage;
import com.flipkart.pages.SelectProductPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
  @BeforeClass
  public void setUP() {
			launchBrowser();
			navigateToURL();

  }

  @AfterClass
  public void tearDown() {
  }
  @Test
  public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("7488388909", "upma@111");
		Assert.assertTrue(actResult);
	}

	
	@Test
	public void seachProductTest() {
		SearchProductPage searchProductPage = new SearchProductPage();
		searchProductPage.validateSearchProduct("laptop");
	}
	
	@Test
	public void selectProductTest() {
		SelectProductPage selectProductPage = new SelectProductPage();
		selectProductPage.validateSelectProduct();
	}
	
	@Test
	public void addToCartTest() {
		AddtoCartPage addToCartPage = new AddtoCartPage();
		addToCartPage.validateAddToCart();
	}
	
	@Test
	public void placeOrderTest() {
		PlaceOrderPage placeOrderPage = new PlaceOrderPage();
		placeOrderPage.validatePlaceOrderPage();
	}
	
	@Test
	public void makePayment() {
	}
	
	@Test
	public void logoutTest() {
	}
	
}



