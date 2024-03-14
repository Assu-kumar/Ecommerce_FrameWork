package objectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom {
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;
	@FindBy(xpath = "//span[text()='Create Account']")
	private WebElement createAccountBtn;
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement forgotpswdBtn;
	/**
	 * @param email
	 * @param password
	 * @param loginBtn
	 * @param createAccountBtn
	 * @param forgotpswdBtn
	 */
	public LoginPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}
	public WebElement getForgotpswdBtn() {
		return forgotpswdBtn;
	}
	/*
	 * Business Logic for Login Page
	 */
           
	public void loginOperation(String email,String pass) {
		getEmail().sendKeys(email);
		getPassword().sendKeys(pass);
		getLoginBtn().click();
	}
	public void createAccount() {
		getCreateAccountBtn().click();
	}
	public void forgotPassword() {
		getForgotpswdBtn().click();
	}
}