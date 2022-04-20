package org.task;

import java.awt.AWTException;
import java.util.Date;
import java.util.List;

import javax.naming.directory.SearchResult;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class Task1 extends BaseClass{
	
	@BeforeClass
	
	private void beforeclass()
	{
		launchbrowser("chrome");
	}
	
	@BeforeMethod
	
	private void beforemethod()
	{
		Date d=new Date();
		System.out.println("Test Starting Time is"+ d);
	}
	
	@Test
	
	private void test1() throws AWTException
	{
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicityWait(20);
		loginPage lp=new loginPage();
		lp.getBgtnClose().click();
		
	    sendkeys(lp.getSearchBoxName(), "iphone");
	    enter();
	    
	    implicityWait(30);
	  }
	
	@Test
	
	private void test2()
	{
		List<WebElement> productname=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(WebElement x:productname)
		{
			System.out.println(x.getText());
		}
	}
	
	@Test
	
	private void test3()
	{
		List<WebElement> price=driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		for(WebElement y:price)
		{
			//System.out.println(y.getText());
			String prices=y.getText();
			prices=prices.replace("\u20b9","");
			System.out.println(prices);
//			
		}
		
	}
	@Test
	
	private void test4()
	{
		
	}
	
	
		
	

}
