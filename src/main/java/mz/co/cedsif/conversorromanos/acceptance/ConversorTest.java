package mz.co.cedsif.conversorromanos.acceptance;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConversorTest {
	public static String BASE_URL = "http://localhost:8080";
	private static WebDriver browser;
	private ConversorPage conversor;

	@BeforeClass
	public static void abreBrowser() {
		browser = new FirefoxDriver();
	}
}
