package com.Automation.myAutomationPrac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends AutomationBasePage 
{
////Xpath Area (1)

	
	@FindBy(xpath="//a[@ title='Women']")
	public WebElement WomenTab;
	
	@FindBy(xpath="//a[contains (@title,'Dresses')]")
	public WebElement DressesTab;
	
	@FindBy(xpath="//a[contains(@title,'T-shirts')]")
	public WebElement TshirtTab;
	
	
	public HomePageObjects() 
	{
		PageFactory.initElements(driver, this);
	}
	
//(Creating methods for above Xpath)
	

	public WebElement OpenWomentTab()
	{
		return WomenTab;
	}
	
	public WebElement OpenDressesTab()
	{
		return DressesTab;
	}
	
	public WebElement OpenTshirtTab()
	{
		return TshirtTab;
	}
	
	public void NavigateToWomenTab()
	{
		WomenTab.click();
	}
	
	public void NavigateToDressesTab()
	{
		DressesTab.click();
	}
	
	public void NavigateToTshirtTab()
	{
		TshirtTab.click();
	}
	
	
}