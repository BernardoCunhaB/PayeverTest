package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SantanderPage {

    protected WebDriver driver = null;
    protected WebDriverWait wait = null;

    public void page (String url) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    protected WebElement waitForElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    By fistNameClick = By.xpath("//*[contains(text(), ' First name ')]");
    By firstNameField = By.xpath("//input[@formcontrolname='firstName']");
    By lastNameClick = By.xpath("//*[contains(text(), ' Last name ')]");
    By lastNameField = By.xpath("//input[@formcontrolname = 'lastName']");
    By emailClick = By.xpath("//*[contains(text(), ' Email ')]");
    By emailField = By.xpath("//input[@formcontrolname = 'email']");
    By passwordClick = By.xpath("//*[contains(text(), ' Password ')]");
    By passwordField = By.xpath("//input[@formcontrolname = 'password']");
    By confirmPasswordClick = By.xpath("//*[contains(text(), ' Confirm Password ')]");
    By confirmPasswordField = By.xpath("//input[@formcontrolname = 'confirmPass']");
    By singUpButton = By.xpath("//*[contains(text(), 'Sign up for free')]");
    By companyNameClick = By.xpath("//*[contains(text(), ' Company name ')]");
    By companyNameField = By.xpath("//*[@id=\"layout-container\"]/div/entry-dynamic-business-registration/entry-dynamic-business-form/form/peb-form-background/div/peb-form-field-input[1]/div/div/div/input");
    By industryCombobox = By.xpath("//*[contains(text(), ' Industry ')]");
    By industrySelector = By.xpath("//*[contains(text(), ' Computers ')]");
    By phoneNumberClick = By.xpath("//*[contains(text(), ' Phone Number ')]");
    By phoneNumberField = By.xpath("//*[@id=\"layout-container\"]/div/entry-dynamic-business-registration/entry-dynamic-business-form/form/peb-form-background/div/pe-input-phone/peb-form-field-input/div/div/div/input");
    By VATNumberClick = By.xpath("//*[contains(text(), ' VAT number ')]");
    By VATNumberField = By.xpath("//*[@id=\"layout-container\"]/div/entry-dynamic-business-registration/entry-dynamic-business-form/form/peb-form-background/div/peb-form-field-input[2]/div/div/div/input");
    By getStartButton = By.xpath("//*[contains(text(), ' Get started with payever')]" );
    By getStartButton2 = By.xpath("//*[contains(text(), ' Get Started ')]" );
    By iconTransactions = By.xpath("//div[contains(@class, 'icons__title') and text()='Transactions']");
    By iconCheckout = By.xpath("//div[contains(@class, 'icons__title') and text()='Checkout']");
    By iconConnect = By.xpath("//div[contains(@class, 'icons__title') and text()='Connect']");
    By iconPointOfSale = By.xpath("//div[contains(@class, 'icons__title') and text()='Point of Sale']");
    By iconSettings = By.xpath("//div[contains(@class, 'icons__title') and text()='Settings']");


    public void firstName (String text) {
        waitForElement(fistNameClick).click();
        waitForElement(firstNameField).sendKeys(text);
    }

    public void lastName (String text) {
        waitForElement(lastNameClick).click();
        waitForElement(lastNameField).sendKeys(text);
    }

    public void email (String text) {
        waitForElement(emailClick).click();
        waitForElement(emailField).sendKeys(text);
    }

    public void password (String text) {
        waitForElement(passwordClick).click();
        waitForElement(passwordField).sendKeys(text);
    }

    public void confirmPassword (String text) {
        waitForElement(confirmPasswordClick).click();
        waitForElement(confirmPasswordField).sendKeys(text);
    }

    public void singUp (){
        waitForElement(singUpButton).click();
    }

    public void companyName (String text) {
        waitForElement(companyNameClick).click();
        waitForElement(companyNameField).sendKeys(text);
    }

    public void industry () {
        waitForElement(industryCombobox).click();
        waitForElement(industrySelector).click();
    }

    public void phoneNumber (String number) {
        waitForElement(phoneNumberClick).click();
        waitForElement(phoneNumberField).sendKeys(number);
    }
    public void VATNumber(String number) throws InterruptedException {
        waitForElement(VATNumberClick).click();
        waitForElement(VATNumberField).sendKeys(number);
        Thread.sleep(5000);
    }

    public void getStart (){
        waitForElement(getStartButton).click();
    }

    public void getStart2 () throws InterruptedException {
        waitForElement(getStartButton2).click();
        Thread.sleep(5000);
    }

    public void Transactions() {
        try {
            WebElement element = driver.findElement(iconTransactions);
            if (element.isDisplayed()) {
                System.out.println("The Transactions icon exists on the panel!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("The Transactions icon was not found on the panel!");
        }
    }

    public void Checkout() {
        try {
            WebElement element = driver.findElement(iconCheckout);
            if (element.isDisplayed()) {
                System.out.println("The Checkout icon exists on the panel!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("The Checkout icon was not found on the panel!");
        }
    }
    public void Connect(){
        try {
            WebElement element = driver.findElement(iconConnect);
            if (element.isDisplayed()) {
                System.out.println("The Connect icon exists on the panel!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("The Connect icon was not found on the panel!");
        }
    }

    public void PointOfSale(){
        try {
            WebElement element = driver.findElement(iconPointOfSale);
            if (element.isDisplayed()) {
                System.out.println("The Point of Sale icon exists on the panel!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("The Point of Sale icon was not found on the panel!");
        }
    }

    public void Settings(){
        try {
            WebElement element = driver.findElement(iconSettings);
            if (element.isDisplayed()) {
                System.out.println("The Settings icon exists on the panel!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("The Settings icon was not found on the panel!");
        }
    }

    public void CloseSystem(){
        driver.quit();
    }

}
