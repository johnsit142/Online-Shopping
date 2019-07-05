package com.Automation.myAutomationPrac;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomePageTest  extends HomePageObjects
{ //Create Objects for homepage and Basepage
	HomePageObjects hp;
	AutomationBasePage abp;
	// Creating Method and
	public HomePageTest()
	{
		hp= new HomePageObjects();
		abp = new AutomationBasePage();
	}
	
	@Test
	public void verifyWomenTab()
	{
		Assert.assertTrue(hp.TxtElementFound(hp.OpenWomentTab()));
	}
	
	@Test
	public void verifyDressesTab()
	{
		Assert.assertTrue(hp.TxtElementFound(hp.OpenDressesTab()));
	}
	
	@Test
	public void verifyTshirtTab()
	{
		Assert.assertTrue(hp.TxtElementFound(hp.OpenTshirtTab()));
	}
	
	@Test
	public void verifyWomenTabNavigated() 
	{
		hp.NavigateToWomenTab();
	}
	
	public void verifDressesTabNavigated()
	{
		hp.NavigateToDressesTab();
	}
	
	public void NAvigateToTshirtTab()
	{
		hp.NavigateToTshirtTab();
	}
}

