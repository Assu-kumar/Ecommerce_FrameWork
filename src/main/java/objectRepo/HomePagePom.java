package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
     @FindBy(xpath = "//input[@name='search']")
     private WebElement seachBar;
     @FindBy(xpath = "//a[@name='cart']")
     private WebElement cart;
     @FindBy(xpath = "//div[text()='S']")
     private WebElement profile;
     @FindBy(xpath = "//a[@name='men']")
     private WebElement menSection;
     @FindBy(xpath = "//a[@name='women']")
     private WebElement womenSection;
     @FindBy(xpath = "//a[@name='kids']")
     private WebElement kidsSection;
     @FindBy(xpath = "//a[@name='electronics']")
     private WebElement electonicSection;
     @FindBy(xpath = "//a[@name='beautyProducts']")
     private WebElement beutySection;
     // Constructor
     public HomePagePom(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     //Getters
	public WebElement getSeachBar() {
		return seachBar;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getMenSection() {
		return menSection;
	}
	public WebElement getWomenSection() {
		return womenSection;
	}
	public WebElement getKidsSection() {
		return kidsSection;
	}
	public WebElement getElectonicSection() {
		return electonicSection;
	}
	public WebElement getBeutySection() {
		return beutySection;
	}
     /*
      * Business Logic for HomePage
      */
	public void search(String search) {
		getSeachBar().sendKeys(search);
		getSeachBar().submit();
	}
	public void clickCart() {
		getCart().click();
	}
	public void clickProfile() {
		getProfile().click();
	}
	public void clickMenSection() {
		getMenSection().click();
	}
	public void clickWomenSection() {
		getWomenSection().click();
	}
	public void clickKidsSection() {
		getKidsSection().click();
	}
	public void clickElectronicSection() {
		getElectonicSection().click();
	}
	public void clickBeutySection() {
		getBeutySection().click();
	}
	
	
}
