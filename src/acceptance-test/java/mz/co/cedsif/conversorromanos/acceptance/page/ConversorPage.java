package mz.co.cedsif.conversorromanos.acceptance.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import mz.co.cedsif.conversorromanos.properties.Properties;

public class ConversorPage {
	private final WebDriver driver;

	public ConversorPage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrePaginaInicial() {
		driver.get(Properties.BASE_URL + Properties.PROJECT_NAME);
	}

	public void abreConversor() {
		driver.findElement(By.linkText("Conversor")).click();
	}

	public boolean conversaoCorrecta(String numeroConvertido) {
		return new WebDriverWait(driver, 30)
				.until(ExpectedConditions.textToBePresentInElement(By.name(Properties.NUMERO_CONVERTIDO_TEXT), numeroConvertido));
	}
	
	public void converteNumero(String numeroPorCOnverter) {
		WebElement txtValor = driver.findElement(By.name(Properties.NUMERO_POR_CONVERTER_TEXT));
		txtValor.sendKeys(numeroPorCOnverter);
		driver.findElement(By.id(Properties.BOTAO_CONVERTER)).click();	
	}
}
