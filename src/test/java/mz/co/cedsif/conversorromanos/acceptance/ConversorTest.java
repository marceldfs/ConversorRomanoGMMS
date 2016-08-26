package mz.co.cedsif.conversorromanos.acceptance;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import mz.co.cedsif.conversorromanos.acceptance.page.ConversorPage;
import mz.co.cedsif.conversorromanos.properties.Properties;

public class ConversorTest {
	private static WebDriver browser;
	private ConversorPage conversor;

	@BeforeClass
	public static void abreBrowser() {
		System.setProperty("webdriver.chrome.driver",Properties.CHROME_DRIVER);
		browser = new ChromeDriver();
	}
	
	@Before
	public void setUp() throws Exception {
		conversor = new ConversorPage(browser);
	}

	@AfterClass
	public static void teardown() {
		browser.close();
	}
	
	@Test
	public void abreAplicacao() throws Exception {
		conversor.abrePaginaInicial();
	}
	
	@Test
	public void abreConversor() throws Exception {
		conversor.abrePaginaInicial();
		conversor.abreConversor();
	}
	
	@Test
	public void tentaConverterI() throws Exception {
		conversor.abrePaginaInicial();
		conversor.abreConversor();
		conversor.converteNumero("I");
		assertTrue(conversor.conversaoCorrecta("1"));
	}
}
