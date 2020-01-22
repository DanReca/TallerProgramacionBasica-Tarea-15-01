/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioimportarbibliotecas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author drecanatesi
 */
public class EjercicioImportarBibliotecas {

    /**
     * @param args the command line arguments
     */
    
    private static WebDriver driver = null;
    
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\drecanatesi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\google.com.vn");  // TODO code application logic here
    }
    
}
