package mz.co.cedsif.conversorromanos.acceptance;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import mz.co.cedsif.conversorromanos.acceptance.page.ConversorPage;
import mz.co.cedsif.conversorromanos.properties.Properties;

public class ConversorTest {
	public static String BASE_URL = Properties.BASE_URL;
	private static WebDriver browser;
	private ConversorPage conversor;

	@BeforeClass
	public static void abreBrowser() {
		browser = new FirefoxDriver();
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
	public void abriConversor() throws Exception {
		conversor.abrePaginaInicial();
	}
}
