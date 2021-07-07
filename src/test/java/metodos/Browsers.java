package metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	private static WebDriver driver; 
	
	public static WebDriver adriver() {		
		return driver;
	}
	
	
	public static void abrirNavegado (String site){
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		

	}

	
	public static void fecharNavegador() {
		
		driver.close();
		
	}
	
}
