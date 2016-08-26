package mz.co.cedsif.conversorromanos.conversor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mz.co.cedsif.conversorromanos.service.Conversor;

public class ConversorTest {
	private Conversor conversor;
	
	@Before
	public void setUp()
	{
		conversor=new Conversor();
	}
	
	@Test
	public void converterI()
	{
		String numeroConverter ="I";
		assertEquals("1",conversor.converter(numeroConverter));
	}
}