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
		numerosRomanos.add(new NumeroRomano('c',100));
		numerosRomanos.add(new NumeroRomano('d',500));
		numerosRomanos.add(new NumeroRomano('m',1000));
	}
	
	public String converter(String numeroConvertido)
	{
		char[]numeros = numeroConvertido.toLowerCase().toCharArray();
		int resultado=0;
		NumeroRomano numeroAnterior = null;
		NumeroRomano numeroActual = null;
		for(int i=0;i<numeros.length;i++)
		{
			numeroActual = devolveRomano(numeros[i]);
			resultado+=numeroActual.getNumeroDecimal();
			if(numeroAnterior!=null && numeroActual.getNumeroDecimal()>numeroAnterior.getNumeroDecimal())
			{
				resultado+=-2*numeroAnterior.getNumeroDecimal();
			}
			numeroAnterior=numeroActual;
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
