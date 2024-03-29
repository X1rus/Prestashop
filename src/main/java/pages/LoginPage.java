package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AHeadComponent {

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = "#submit-login")
    private WebElement loginButton;

    @FindBy(css = "div.no-account>a")
    private WebElement noAccountButton;

    @FindBy(css = "form#login-form a")
    private WebElement forgotPassword;



//    public LoginPage(WebDriver driver){
//        super(driver);
//        PageFactory.initElements(driver, this);
//    }
    //getters,setters, cleaners
    //email field
//    public WebElement getEmailField(){
//        return emailField;
//    }
    @Step("set email")
    public void setEmailFIeld(String eMail){
        this.emailField.click();
        this.emailField.clear();
        this.emailField.sendKeys(eMail);
    }


//    //password field
//    public WebElement getPasswordField(){
//        return passwordField;
//    }
//    @Step("set password")
//    public void setPasswordField(String password){
//        this.passwordField.click();
//        this.passwordField.clear();
//        this.passwordField.sendKeys(password);
//    }


    //login button
    public WebElement getLoginButton() {
        return loginButton;
    }
    @Step("click the Login button")
    public void clickLoginButton(){
        getLoginButton().click();
    }

    //no account
    public WebElement getNoAccountButton() {
        return noAccountButton;
    }
    @Step("click No account button")
    public void clickNoAccountButton(){
        getNoAccountButton().click();
    }

    //forgot password
    public WebElement getForgotPassword(){
        return forgotPassword;
    }
    @Step("click Forgot Password button")
    public Forgot_password clickForgotPassword(){
        getForgotPassword().click();
        return new Forgot_password(driver);
    }
//    @FindBy(css = "#login-form > section > div:nth-child(2) " +
//            "> div.col-md-6 > input")
//    private WebElement emailField;
//
//    @FindBy(css = "#login-form > section > div:nth-child(3) " +
//            "> div.col-md-6 > div > input")
//    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"submit-login\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@class=\"btn\"]")
    private WebElement showButton;

    @FindBy(xpath = "//*[@class=\"btn\"]")
    private WebElement hideButton;

    @FindBy(css = "#login-form > section > div.forgot-password > a")
    private WebElement forgotPasswordButton;

    @FindBy(css = "#content > div > a")
    private WebElement createAccountButton;

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // PageObject Atomic Operation

    // emailField
    @Step("get email")
    public WebElement getEmailField() {
        return emailField;
    }

    @Step("get text of email")
    public String getEmailFieldText() {
        return getEmailField().getText();
    }

    @Step("set email")
    public void setEmailField(String text) {
        getEmailField().sendKeys(text);
    }

    @Step("clear email field")
    public void clearEmailField() {
        getEmailField().clear();
    }

    @Step("click email field")
    public void clickEmailField() {
        getEmailField().click();
    }

    // passwordField
    @Step("get password field")
    public WebElement getPasswordField() {
        return passwordField;
    }

    @Step("get text of password")
    public String getPasswordFieldText() {
        return getPasswordField().getText();
    }

    @Step("set password")
    public void setPasswordField(String text) {
        getPasswordField().sendKeys(text);
    }

    @Step("clear password field")
    public void clearPasswordField() {
        getPasswordField().clear();
    }

    @Step("click password field")
    public void clickPasswordField() {
        getPasswordField().click();
    }

    //Sign in button
    @Step("get sign in button")
    public WebElement getSignInButton() {
        return signInButton;
    }

    @Step("click sign in button")
    public void clickSignInButton() {
        getSignInButton().click();
    }

    //Show button
    @Step("get show button")
    public WebElement getShowButton() {
        return showButton;
    }

    @Step("click show button")
    public void clickShowButton() {
        getShowButton().click();
    }

    //Hide button
    @Step("get hide button")
    public WebElement getHideButton() {
        return hideButton;
    }

    @Step("click hide button")
    public void clickHideButton() {
        getHideButton().click();
    }

    //Forgot your password button
    @Step("get forgot your password button")
    public WebElement getForgotPasswordButton() {
        return forgotPasswordButton;
    }

    @Step("click forgot your password button")
    public void clickForgotPasswordButton() {
        getForgotPasswordButton().click();
    }

    //Create account button
    @Step("get create account button")
    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    @Step("click create account button")
    public void clickCreateAccountButton() {
        getCreateAccountButton().click();
    }

}


