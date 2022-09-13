package testFront;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageHome {
	
	private org.openqa.selenium.WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe")
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	//avisamos do teste
	@Test
	public void TestNavegabilidade() {
		driver.get("https://online.sp.senai.br/");
	//seleciona campo de teste
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Informática");
		driver.findElement(By.id("Busca1_btnBusca")).click();
		
		
		
	}
}
