package mz.co.cedsif.conversorromanos.service;

import java.util.ArrayList;
import java.util.List;

import mz.co.cedsif.conversorromanos.model.NumeroRomano;

public class GestorNumero {
	List<NumeroRomano> numerosRomanos;

	public GestorNumero() {
		numerosRomanos = new ArrayList<>();
		numerosRomanos.add(new NumeroRomano('i', 1, 1));
		numerosRomanos.add(new NumeroRomano('v', 5, 2));
		numerosRomanos.add(new NumeroRomano('x', 10, 3));
		numerosRomanos.add(new NumeroRomano('l', 50, 4));
		numerosRomanos.add(new NumeroRomano('c', 100, 5));
		numerosRomanos.add(new NumeroRomano('d', 500, 6));
		numerosRomanos.add(new NumeroRomano('m', 1000, 7));
	}

	public NumeroRomano devolveRomano(char numero) {
		for (NumeroRomano numeroRomano : numerosRomanos) {
			if (numeroRomano.getNumeroRomano() == numero)
				return numeroRomano;
		}
		return null;
	}
}
