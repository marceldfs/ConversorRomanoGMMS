package mz.co.cedsif.conversorromanos.service;

public class Conversor {
	
	public String converter(String numeroConvertido)
	{
		char[]numeros = numeroConvertido.toCharArray();
		int resultado=0;
		for(int i=0;i<numeros.length;i++)
		{
			resultado++;
		}
		return resultado+"";
	}
}
