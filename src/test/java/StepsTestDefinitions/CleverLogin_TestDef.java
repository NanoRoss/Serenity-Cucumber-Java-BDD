package StepsTestDefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import Pages.Page_Login_CleverSite;
import org.openqa.selenium.WebDriver;


public class CleverLogin_TestDef {

    @Page
    Page_Login_CleverSite page_login_cleverSite;  //Al usar Serenity no me hace falta instanciar la clase Page.

    @Managed
    WebDriver driver;

    //Background Steps

    @Given("Usuario ingresa direccion web clever.com")
    public void usuario_ingresa_direccion_web_clever_com() {
        page_login_cleverSite.IntoTheClaverSite();
    }

    @Then("Usuario se encuentra en el sitio.")
    public void usuario_se_encuentra_en_el_sitio() {
        System.out.println("El Usuario se encuentra en el Loguin");
    }

    //Steps

    @When("user ingresa el usuario en el Login")
    public void user_ingresa_el_usuario_en_el_login() {
        page_login_cleverSite.SetInput_Usuario();
    }

    @And("user ingresa el pass en el Login y selecciona Ingresar")
    public void user_ingresa_el_pass_en_el_login_y_selecciona_ingresar() {
        page_login_cleverSite.SetInput_Pass();
        page_login_cleverSite.ClickOnLoginButton();
    }

    @Then("user valida nombre de usuario Logueado")
    public void user_valida_nombre_de_usuario_logueado() {
        page_login_cleverSite.ValidateCorrectLogin();
    }
}
