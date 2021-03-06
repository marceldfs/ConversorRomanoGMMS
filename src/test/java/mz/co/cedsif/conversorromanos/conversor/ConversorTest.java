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
	
	@Test
	public void converterII()
	{
		String numeroConverter ="II";
		assertEquals("2",conversor.converter(numeroConverter));
	}
	
	@Test
	public void converterV()
	{
		String numeroConverter ="V";
		assertEquals("5",conversor.converter(numeroConverter));
	}
	
	@Test
	public void converterIV()
	{
		String numeroConverter ="IV";
		assertEquals("4",conversor.converter(numeroConverter));
	}
	
	@Test
	public void converterMMDCCXIII()
	{
		String numeroConverter ="MMDCCXIII";
		assertEquals("2713",conversor.converter(numeroConverter));
	}
	
	@Test(expected=Exception.class)
	public void converterU()
	{
		String numeroConverter ="U";
		String resultado = conversor.converter(numeroConverter);
	}
	
	@Test(expected=Exception.class)
	public void converterIL()
	{
		String numeroConverter ="IL";
		String resultado = conversor.converter(numeroConverter);
	}
	
	@Test(expected=Exception.class)
	public void converterVX()
	{
		String numeroConverter ="VX";
		String resultado = conversor.converter(numeroConverter);
	}
	
	@Test(expected=Exception.class)
	public void converterIIII()
	{
		String numeroConverter ="IIII";
		String resultado = conversor.converter(numeroConverter);
	}
	
	@Test
	public void converterMCCLXXVIII()
	{
		String numeroConverter ="MCCLXXVIII";
		assertEquals("1278",conversor.converter(numeroConverter));
	}

	@Test(expected=Exception.class)
	public void converterIXIX()
	{
		String numeroConverter ="IXIX";
		String resultado = conversor.converter(numeroConverter);
	}
}
