package mz.co.cedsif.conversorromanos.acceptance.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mz.co.cedsif.conversorromanos.properties.Properties;

public class ConversorPage {
	private static String BASE_URL = Properties.BASE_URL;
	private final WebDriver driver;

	public ConversorPage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrePaginaInicial() {
		driver.get(BASE_URL + "/ConversorRomanoGMMS");
	}

	public void abreConversor() {
		driver.findElement(By.linkText("Conversor")).click();	
	}

}
