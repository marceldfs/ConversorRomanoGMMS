package mz.co.cedsif.conversorromanos.service;

import java.util.ArrayList;
import java.util.List;

import mz.co.cedsif.conversorromanos.model.NumeroRomano;

public class Conversor {
	List<NumeroRomano> numerosRomanos;
	
	public Conversor()
	{
		numerosRomanos = new ArrayList<>();
		numerosRomanos.add(new NumeroRomano('i',1));
		numerosRomanos.add(new NumeroRomano('v',5));
		numerosRomanos.add(new NumeroRomano('x',10));
		numerosRomanos.add(new NumeroRomano('l',50));
		numerosRomanos.add(new NumeroRomano('l',100));
	}
	
	public String converter(String numeroConvertido)
	{
		char[]numeros = numeroConvertido.toLowerCase().toCharArray();
		int resultado=0;
		for(int i=0;i<numeros.length;i++)
		{
			resultado+=devolveRomano(numeros[i]).getNumeroDecimal();
		}
		return resultado+"";
	}
	
	public NumeroRomano devolveRomano(char numero)
	{
		for(NumeroRomano numeroRomano : numerosRomanos)
		{
			if(numeroRomano.getNumeroRomano()==numero)
				return numeroRomano;
		}
		return null;
	}
}
