package org.Petofy;


import java.time.Duration;
import java.util.Arrays;

import org.Petofy.utils.AndroidActions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterPet extends AndroidActions {
	//private static final Logger logger = LogManager.getLogger(RegisterPet.class);
	AndroidDriver driver;
	public RegisterPet(AndroidDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/addNewEntry")
	private WebElement PlusIcon;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/add_pet_type")
	private WebElement selectPet;
	
	//need to verify
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Dog']")
	private WebElement choosePet;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/maleRB")
	private WebElement selectGender;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/add_pet_breed_dialog")
	private WebElement petbreedDropdown;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Akita']")
	private WebElement SelectPetBreed;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/pet_name_ET")
	private WebElement TypePetName;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/convert_yr_to_age")
	private WebElement petDOB;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/age_wise")
	private WebElement dateofDob;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Week']")
	private WebElement selectweek;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/age_neumeric")
	private WebElement clickAgeplaceholder;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/add_pet_color_dialog")
	private WebElement petColordropdown;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Beige']")
	private WebElement selectpetColor;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/pet_parent_name_ET")
	private WebElement parentname;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/pet_contact_number")
	private WebElement wtsappNumber;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/pet_Alternatecontact_number")
	private WebElement alternateno;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/pet_email_ET")
	private WebElement emailfield;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/pet_address_ET")
	private WebElement addressField;
	//Continue button
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/save_changes_BT")
	private WebElement continuebutton;
	
	//back button com.cynoteck.petofyOPHR:id/back_arrow_CV// com.cynoteck.petofyOPHR:id/back_arrow_RL
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/back_arrow_RL")
	private WebElement backarrow;
	
	
	
	
	public void clickPlusIcon() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	        try {
	            wait.until(ExpectedConditions.elementToBeClickable(PlusIcon)).click();
	            
	            // Add any assertions or further actions here
	            
	        } catch (TimeoutException e) {
	            System.out.println("Plus icon was not clickable within the timeout period");
	            // Handle the exception appropriately (e.g., take screenshot, log error)
	        }
	}
	
	public void petCategory() throws InterruptedException {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        try {
//	            String expectedText = "Select Pet Category";            
//	            // Wait until the element contains the expected text
//	            wait.until(ExpectedConditions.textToBePresentInElement(selectPet, expectedText));	            
	            // Wait until the element is clickable before clicking
	            wait.until(ExpectedConditions.elementToBeClickable(selectPet)).click();
	            // Add any assertions or further actions here    
	        } catch (TimeoutException e) {
	            System.out.println("Timed out waiting for pet category selection");
	            // Handle the exception appropriately (e.g., take screenshot, log error)
	        }
		
	}
	
	public void selectPetType() {
		//choosePet.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(choosePet)).click();
			 
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting to select pet");
		}
	}
	
	public void ChooseGender() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectGender)).click();
			 
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting to click gender");
		}
	}
	
	
	public void ClickBreedDropdown() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(petbreedDropdown)).click();
			 
		}
		catch( TimeoutException e) {
			System.out.println("Timed out waiting to click gender");
		}
		
		
	}
	
	public void selectBreedName() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        try {

	            // Wait until the element is clickable before clicking
	            wait.until(ExpectedConditions.elementToBeClickable(SelectPetBreed)).click();
	        } catch (TimeoutException e) {
	            System.out.println("Timed out waiting for Pet Breed selection");
	            // Handle the exception appropriately (e.g., take screenshot, log error)
	        }
		
	}
	
	
	public void petName(String petname) {
	   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    try {
	        // Wait until the TypePetName element is clickable
	        wait.until(ExpectedConditions.elementToBeClickable(TypePetName));
	        
	        // Send the petname value to the element
	        TypePetName.sendKeys(petname);
	        
	        System.out.println("Successfully entered pet name: '" + petname + "'");
	        
	    } catch (TimeoutException e) {
	        System.err.println("Timed out waiting for Pet name selection");
	        // Handle the exception appropriately (e.g., take screenshot, log error)
	    } catch (Exception e) {
	        System.err.println("An error occurred while entering pet name: " + e.getMessage());
	        // Handle other exceptions appropriately
	    }
		
		
	}
	
	public void DOBofPet() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(petDOB)).click();
			 
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet date dob dropdown selection");
		}
		
	}
	
	public void selectDaydropdown() {
		//dateofDob
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(dateofDob)).click();
			
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for day dropdown selection");
		}
	}
	
	public void typeDayofDOB() throws InterruptedException {
		//selectweek.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectweek)).click();
			
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for day of dob selection");
		}
	}
	
	public void clickagebox(int index ) throws InterruptedException {
//		clickAgeplaceholder.sendKeys(String.valueOf(index));
//		 driver.navigate().back();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        try {
	            // Wait until the age placeholder is clickable
	            wait.until(ExpectedConditions.elementToBeClickable(clickAgeplaceholder));
	            clickAgeplaceholder.click();
	           
	            // Enter the age value
	            clickAgeplaceholder.sendKeys(String.valueOf(index));
	            driver.hideKeyboard();
	            //driver.navigate().back(); 
	        } catch (TimeoutException e) {
	            System.err.println("Timed out waiting for age field or navigation: " + e.getMessage());
	            // Handle the exception appropriately (e.g., take screenshot, log error)
	        }
		
	}
	
	public void clickpetcolordropdown() throws InterruptedException {
		//petColordropdown.click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(petColordropdown)).click();
			
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet color dropdown");
		}
	}
	
	public void selectPetcolorDropdown() throws InterruptedException {
		//selectpetColor.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectpetColor)).click();
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet selection of pet color");
		}
		
	}
	
	public void petParentname(String petparent) throws InterruptedException {
		//parentname.sendKeys(petparent);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(parentname));
			parentname.sendKeys(petparent);
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet parent name ");
		}
	}
	
	public void scrollScreen() throws InterruptedException {
		 PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	 
	        int numberOfIterations = 1;
			for (int j = 0; j < numberOfIterations; j++) {
	            Dimension size = driver.manage().window().getSize();
            int startX = size.width / 2;
	            int startY = (int) (size.height * 0.8);
	            int endY = (int) (size.height * 0.1);

	            Sequence swipe = new Sequence(finger, 1);
	            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
	            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	            swipe.addAction(
	                    finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
	            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	            driver.perform(Arrays.asList(swipe));
	            Thread.sleep(10000);
	        }
	}
	
	public void enterWhatsappNumber(String mobileNo) throws InterruptedException {
		//wtsappNumber.sendKeys(mobileNo);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(wtsappNumber));
			wtsappNumber.sendKeys(mobileNo);
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet whats app number selection");
		}
		
	}
	
	public void addAlternatenum(String alternatenum) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alternateno));
			alternateno.sendKeys(alternatenum);
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet whats app number selection");
		}
		
	}
	
	public void fillEmail(String email) throws InterruptedException {
		
		//emailfield.sendKeys(email);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(emailfield));
			emailfield.sendKeys(email);
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet parent email");
		}
	}
	
	public void fillAddress(String address) throws InterruptedException {
		//addressField.sendKeys();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(addressField));
			addressField.sendKeys(address);
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for Pet parent address");
		}
	}
	
	public void clickContinueButton() throws InterruptedException {
		//continuebutton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(continuebutton)).click();
			//driver.navigate().back();
		}
		catch(TimeoutException e) {
			System.out.println("Timed out waiting for continue button");
		}
	}
	
	public void navigateBack() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(backarrow)).click();
			
		}
		catch(TimeoutException e) {
			System.out.println("navigating back");
		}
	}
	
}
