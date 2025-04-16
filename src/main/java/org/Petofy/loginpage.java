package org.Petofy;

import java.time.Duration;

import org.Petofy.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.Annotations;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.errorprone.annotations.FormatString;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginpage extends AndroidActions{//extends AndroidActions
	
	AndroidDriver driver;
	public loginpage(AndroidDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
//	 WebElement allowButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
//     allowButton.click();
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement allowButton;	
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement clickAllowbutton;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/login_BT")
	private WebElement clickLoginButton;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/email_TIET")
	private WebElement typeEmail;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/password_TIET")
	private WebElement typePassword;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/login_BT")
	private WebElement signIn;
	
//	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/addNewEntry")
//	private WebElement PlusIcon;
	
	public void setallowButton() throws InterruptedException {
		//allowButton.click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(allowButton)).click();
		}
		catch(TimeoutException e) {
			System.out.println("firstallow icon was not clickable within the timeout period");
		}
		
		
	}
	
	public void secondAllow() throws InterruptedException {
		//clickAllowbutton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(clickAllowbutton)).click();
		}
		catch(TimeoutException e) {
			System.out.println("allow icon was not clickable within the timeout period");
		}
	}
	
	public void setLoginClick() throws InterruptedException {
		//clickLoginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(clickLoginButton)).click();
		}
		catch(TimeoutException e) {
			System.out.println("login button was not clickable within the timeout period");
		}
	}
	
	public void setEmailField(String email) throws InterruptedException {
		//typeEmail.sendKeys(email);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(typeEmail)).click();
			typeEmail.sendKeys(email);
		}
		catch(TimeoutException e) {
			System.out.println("email was not clickable within the timeout period");
		}
	}

	public void setPasswordField(String password) throws InterruptedException
	{
		//typePassword.sendKeys(password);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(typePassword)).click();
			typePassword.sendKeys(password);
		}
		catch(TimeoutException e) {
			System.out.println("password clickable within the timeout period");
		}
		
	}
	
	public void setSignIn() throws InterruptedException
	{
		//signIn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
		}
		catch(TimeoutException e) {
			System.out.println("Sign In button was not clickable within the timeout period");
		}
		
	}
//	public void clickPlusIcon() throws InterruptedException {
//		PlusIcon.click();
//		Thread.sleep(10000);
//	}
//	
	
	
}
