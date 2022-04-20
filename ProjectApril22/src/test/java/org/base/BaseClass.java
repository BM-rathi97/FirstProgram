package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	//**BrowserLaunch**//
	
	public static WebDriver launchbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;	
	}
	
	public static WebDriver chromeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
	}
	
	public static WebDriver firefoxBrowser()
	{
		WebDriverManager.chromedriver().setup();
		return driver=new FirefoxDriver();
	}
	
	public static WebDriver edgeBrowser()
	{
		WebDriverManager.edgedriver().setup();
		return driver= new EdgeDriver();
	}
	
	//** URL Launch**//
	
	public static void urlLaunch(String url)
	{
		driver.get(url);
	}
	
	//** Maximize**//
	
    public static void maximize()
		{
			driver.manage().window().maximize();
		}
	
    //*8Implicity Wait**//
    public static void implicityWait(long secs)
    {
    	driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
    }
    
    //**SendKeys**//
    
    public static void sendkeys(WebElement e, String value)
    {
    	e.sendKeys(value);
    }
    
    //**Click**//
    public static void click(WebElement e)
    {
    	e.click();
    }
    
    //**GetURL**//
    
    public static String geturl()
    {
    	String url=driver.getCurrentUrl();
    	return url;
    }
    
    //** GetTittle**//
    
    public static String getTitle()
    {
    	String title=driver.getTitle();
    	return title;
    }
    
    //**Quit**//
    public static void quit()
    {
    	driver.quit();
    }
    
    //**Get Attributes**//
    public static String getAttributes(WebElement e)
    {
    	String attributes=e.getAttribute("value");
    	return attributes;
    }

    //**MoveToelement**//
    public static void moveToElement(WebElement target)
    {
    	Actions a=new Actions(driver);
    	a.moveToElement(target).perform();
    }
    
    //**DoubleClick**//
    public static void doubleClick(WebElement e)
    {
    	Actions a=new Actions(driver);
    	a.doubleClick(e).perform();
    }
    //**ContextClick**//
    public static void contextClick(WebElement e)
    {
    	Actions a=new Actions(driver);
    	a.contextClick(e).perform();
    }
    //**DragandDrop**//
    public static void dragAndDrop(WebElement source, WebElement Target)
    {
    	Actions a=new Actions(driver);
    	a.dragAndDrop(source, Target).perform();
    }
    
    //**SelectByIndex**//
    
    public static void selectByIndex(WebElement e,int i)
    {
    	Select s=new Select(e);
    	s.selectByIndex(i);
    }
    
    //**SelectByValue**//
    
    public static void selectByValue(WebElement e, String value)
    {
    	Select s=new Select(e);
    	s.selectByValue(value);
    }
    
   //**SelectByVisibleText**//
    
    public static void selectByVisibleText(WebElement e, String value)
    {
    	Select s=new Select(e);
    	s.selectByVisibleText(value);
    }
 //**DeselectByIndex**//
    
    public static void deselectByIndex(WebElement e,int i)
    {
    	Select s=new Select(e);
    	s.deselectByIndex(i);
    }
    
    //**DeselectByValue**//
    
    public static void deselectByValue(WebElement e, String value)
    {
    	Select s=new Select(e);
    	s.deselectByValue(value);   
    	}
    
//**DeSelectByVisibleText**//
    
    public static void DeselectByVisibleText(WebElement e, String value)
    {
    	Select s=new Select(e);
    	s.deselectByVisibleText(value);
    }
    
    //deselectall//
    
    public static void deselectAll(WebElement e)
    {
    	Select s= new Select(e);
    	s.deselectAll();
    }
//Enter//
    
    public static void enter() throws AWTException
    {
    	Robot r= new Robot();
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    }
    
    
}
