package mz.co.cedsif.conversorromanos.service;

import mz.co.cedsif.conversorromanos.model.NumeroRomano;

public class Conversor {

	private GestorNumero gestor;
	private NumeroRomano numeroUltimo = null;
	private NumeroRomano numeroPenultimo = null;
	private NumeroRomano numeroAntePenultimo = null;
	private NumeroRomano numeroActual = null;

	public Conversor() {
		gestor = new GestorNumero();
	}

	public String converter(String numeroConvertido) {
		char[] numeros = numeroConvertido.toLowerCase().toCharArray();
		int resultado = 0;
		
		numeroActual = null;
		numeroUltimo = null;
		numeroPenultimo = null;
		numeroAntePenultimo = null;
		
		for (int i = 0; i < numeros.length; i++) {
			numeroActual = gestor.devolveRomano(numeros[i]);
			if (i >= 3) {
				if (numeroActual.getNumeroRomano() == numeroUltimo.getNumeroRomano()
						&& numeroUltimo.getNumeroRomano() == numeroPenultimo.getNumeroRomano()
						&& numeroPenultimo.getNumeroRomano() == numeroAntePenultimo.getNumeroRomano()) {
					throw new IllegalArgumentException();
				}
			}
			resultado += numeroActual.getNumeroDecimal();
			if (numeroUltimo != null && numeroActual.getNumeroDecimal() > numeroUltimo.getNumeroDecimal()) {
				if (numeroUltimo.getPosicao() % 2 == 1 || numeroActual.getPosicao() - numeroUltimo.getPosicao() > 2) {
					throw new IllegalArgumentException();
				}
				resultado += -2 * numeroUltimo.getNumeroDecimal();
			}
			if (i >= 2) {
				if(numeroActual.getNumeroDecimal()<=numeroPenultimo.getNumeroDecimal() && numeroUltimo.getNumeroDecimal()>numeroPenultimo.getNumeroDecimal())
				{
					throw new IllegalArgumentException();
				}
				numeroAntePenultimo = numeroPenultimo;
			}
			if (i >= 1) {
				numeroPenultimo = numeroUltimo;
			}
			numeroUltimo = numeroActual;
		}
		return resultado + "";
	}
}
