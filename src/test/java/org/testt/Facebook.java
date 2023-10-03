package org.testt;

import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pages.LoginPage;
import org.pages.RegestrationPage;

public class Facebook extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
		implicitlyWait();
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass() {
		quit();
		System.out.println("After Class");
	}
	@Before
	public void before() {
		System.out.println("Test Start"+new Date());
	}
	@After
	public void after() {
		System.out.println("Test end"+new Date());
	}
	@Test
	public void test1() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		String currentUrl = getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		Assert.assertTrue("Verify url",contains);
		
		LoginPage l=new LoginPage(); 
		sendKeys(l.getTxtUsername(), "jbcbjhsc");
		String attribute = getAttribute(l.getTxtUsername());
		Assert.assertEquals("verify username","jbcbjhsc", attribute);
		
		sendKeys(l.getTxtPassword(), "yuvaraj5625");
		String attribute2 = getAttribute(l.getTxtPassword());
		Assert.assertEquals("verify password","yuvaraj5625", attribute2);
		
		click(l.getBtnLogin());
		thread(5000);
		String currentUrl2 = getCurrentUrl();
		boolean contains2 = currentUrl2.contains("privacy_mutation_token");
		Assert.assertTrue("verify invalid page",contains2);
	}
	@Test
	public void test2() {
		urlLaunch("https://www.facebook.com/");
		String currentUrl = getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		Assert.assertTrue("verify url",contains);
		
		RegestrationPage r=new RegestrationPage();
		
		click(r.getBtnCreateNew());
		String title = getTitle();
		boolean contains2 = title.contains("Facebook");
		Assert.assertTrue("verify regestration",contains2);
		
		sendKeys(r.getTxtFirstName(), "yuva");
		String attribute = getAttribute(r.getTxtFirstName());
		Assert.assertEquals("verify first name","yuva", attribute);
		
		sendKeys(r.getTxtLastName(), "raj");
		String attribute2 = getAttribute(r.getTxtLastName());
		Assert.assertEquals("verify last name","raj", attribute2);
		
		sendKeys(r.getTxtMobileNumber(), "9345782203");
		String attribute3 = getAttribute(r.getTxtMobileNumber());
		Assert.assertEquals("verify mobile number","9345782203", attribute3);
		
		sendKeys(r.getTxtPassword(), "9898");
		String attribute4 = getAttribute(r.getTxtPassword());
		Assert.assertEquals("verify mobile number","9898", attribute4);
		
		click(r.getBtnSignup());
		System.out.println("Test2");
	}
	
}
