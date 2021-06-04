package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClasse {

	public static void main(String[] args) {
		// declaration et instantiation des objets		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "https://www.legalife.fr/inscription/";					
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the adresse email		
        WebElement email = driver.findElement(By.id("email"));							

        // Get the WebElement correspondant au champ mot de passe	
        WebElement password = driver.findElement(By.name("passwd"));							

        email.sendKeys("mmakei@gmail.com");					
        password.sendKeys("amdzsg123");					
        System.out.println("Text Field Set");					
         
        // Suppression des données dans la zone de texte		
        email.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					

        // Chercher le bouton login		
        WebElement login = driver.findElement(By.id("SubmitLogin"));							
                    		
        // Using click method to submit form		
        email.sendKeys("mmakei@gmail.com");					
        password.sendKeys("amdzsg123");					
        login.click();			
        System.out.println("Login Done with Click");					
        		
        //. Submit used champ mot de passe	
        driver.get(baseUrl);					
        driver.findElement(By.id("email")).sendKeys("mmakei@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("amdzsg123");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");					
         
		//driver.close();

	}

}
