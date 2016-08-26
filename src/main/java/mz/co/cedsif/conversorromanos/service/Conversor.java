package mz.co.cedsif.conversorromanos.service;

import mz.co.cedsif.conversorromanos.model.NumeroRomano;

public class Conversor {
	
	GestorNumero gestor;
	
	public Conversor()
	{
		gestor = new GestorNumero();
	}
	
	public String converter(String numeroConvertido)
	{
		char[]numeros = numeroConvertido.toLowerCase().toCharArray();
		int resultado=0;
		NumeroRomano numeroAnterior = null;
		NumeroRomano numeroActual = null;
		for(int i=0;i<numeros.length;i++)
		{
			numeroActual = gestor.devolveRomano(numeros[i]);
			resultado+=numeroActual.getNumeroDecimal();
			if(numeroAnterior!=null && numeroActual.getNumeroDecimal()>numeroAnterior.getNumeroDecimal())
			{
				if(numeroActual.getPosicao()-numeroAnterior.getPosicao()>2)
				{
					throw new IllegalArgumentException();
				}
				resultado+=-2*numeroAnterior.getNumeroDecimal();
			}
			numeroAnterior=numeroActual;
		}
		return resultado+"";
	}
}
