package objectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPagePom {
           @FindBy(xpath = "//input[@id='First Name']")
           private WebElement firstName;
           @FindBy(xpath = "//input[@id='Last Name']")
           private WebElement lastName;
           @FindBy(xpath = "//input[@id='Female']")
           private WebElement femaleRadioBtn;
           @FindBy(xpath = "//input[@id='Male']")
           private WebElement maleRadioBtn;
           @FindBy(xpath = "//input[@id='Other']")
           private WebElement otherRadioBtn;
           @FindBy(xpath = "//input[@id='Phone Number']")
           private WebElement phNum;
           @FindBy(xpath = "//input[@id='Email Address']")
           private WebElement emailId;
           @FindBy(xpath = "//input[@id='Password']")
           private WebElement password;
           @FindBy(xpath = "//input[@id='Confirm Password']")
           private WebElement confirmPassword;
           @FindBy(xpath = "//input[@id='Terms and Conditions']")
           private WebElement iAgree;
           @FindBy(xpath = "//button[text()='Register']")
           private WebElement register;
           
           public SignUpPagePom(WebDriver driver) {
        	   PageFactory.initElements(driver, this);
           }
           
           public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getFemaleRadioBtn() {
			return femaleRadioBtn;
		}

		public WebElement getMaleRadioBtn() {
			return maleRadioBtn;
		}

		public WebElement getOtherRadioBtn() {
			return otherRadioBtn;
		}

		public WebElement getPhNum() {
			return phNum;
		}

		public WebElement getEmailId() {
			return emailId;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getConfirmPassword() {
			return confirmPassword;
		}

		public WebElement getiAgree() {
			return iAgree;
		}

		public WebElement getRegister() {
			return register;
		}

		/*
            * Business Logic of Create Account 
            */
           public void signUp(String firstname,String lastName,String phNo,String email,
        		   String password,String confrmPassword) {
        	   getFirstName().sendKeys(firstname);
        	   getLastName().sendKeys(lastName);
        	   getPhNum().sendKeys(phNo);
        	   getEmailId().sendKeys(email);
        	   getPassword().sendKeys(password);
        	   getConfirmPassword().sendKeys(confrmPassword);
        	   getiAgree().click();
        	   getRegister().click();
        	   
           }
           
           
}
