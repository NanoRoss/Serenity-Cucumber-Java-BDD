package Pages;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Step;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.FindBy;
import Helpers.helpers;
import static org.junit.Assert.*;


import static net.serenitybdd.core.environment.WebDriverConfiguredEnvironment.getEnvironmentVariables;



public class Page_Login_CleverSite extends PageObject {

    helpers helpers = new helpers(getDriver());


    @FindBy(xpath = "//input[@id='username']")
    private WebElementFacade input_Usuario;

    @FindBy(xpath = "//input[@id='password']")
    private WebElementFacade input_Pass;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElementFacade Btn_Ingresar;

    @FindBy(xpath = "//span[contains(text(),'Sarah Smithy')]")
    private WebElementFacade IncadorDePass;

    @Step
    public void IntoTheClaverSite(){
        getDriver().get(EnvironmentSpecificConfiguration.from(getEnvironmentVariables()).getProperty("webdriver.base.url"));
        //navigateTo.
    }


    public void SetInput_Usuario(){
        this.input_Usuario.sendKeys("ssmithy");
    }

    public void SetInput_Pass(){
        this.input_Pass.sendKeys("clever");
    }

    public void ClickOnLoginButton(){
        this.Btn_Ingresar.click();
    }

    public void ValidateCorrectLogin(){
        assertTrue(this.IncadorDePass.isDisplayed());
    }


   private String UrlLoginClaver = "https://clever.com/oauth/sis/login?target=NTVmMjIwM2Y0NDMxNGEwMTAwMDA0OGUx%3BNGM2M2MxY2Y2MjNkY2U4MmNhYWM%3D%3BaHR0cHM6Ly9jbGV2ZXIuY29tL2luL2F1dGhfY2FsbGJhY2s%3D%3BMTYzZjUxYTIzYTZlYzA4NTY4NmNlOTgwYTIzY2I3NGNhNWFmYWI3MjgyZDI4NDk2NTgxYjNlYTY1ZjI1NmQ1OA%3D%3D%3BY29kZQ%3D%3D%3B&skip=1&default_badge=";

}
