package Helpers;

import org.openqa.selenium.WebDriver;

public class helpers {

    private WebDriver driver; // Instancio un Objeto Driver para usar.


    public helpers (WebDriver driver) // Metodo Constructor: Es un metodo especial que se encarga de dar un estado inicial a nuestro objeto.
    {
        this.driver = driver; //Mi Webdriver
    }

    public void SleepSeconds(int seconds) //El método Thread.sleep (long millis) hace que el subproceso actualmente en ejecución se suspenda n milisegundos.
    {
        try { Thread.sleep(seconds*1000);}
        catch (InterruptedException e)
        {e.printStackTrace(); } // dice qué sucedió y en qué parte del código sucedió esto.
    }
}
