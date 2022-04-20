package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseClass {
	
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement searchBoxName;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement bgtnClose;

	public WebElement getBgtnClose() {
		return bgtnClose;
	}

	public WebElement getSearchBoxName() {
		return searchBoxName;
	}

	
	

}
