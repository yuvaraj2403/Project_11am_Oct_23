package org.pages;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegestrationPage extends BaseClass {
	public RegestrationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btnCreateNew;
	@FindBy(name="firstname")
	private WebElement txtFirstName;
	@FindBy(name="lastname")
	private WebElement txtLastName;
	@FindBy(name="reg_email__")
	private WebElement txtMobileNumber;
	@FindBy(name="reg_passwd__")
	private WebElement txtPassword;
	@FindBy(name="websubmit")
	private WebElement btnSignup;
	public WebElement getBtnCreateNew() {
		return btnCreateNew;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtMobileNumber() {
		return txtMobileNumber;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnSignup() {
		return btnSignup;
	}
}
