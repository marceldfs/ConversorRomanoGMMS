package mz.co.cedsif.conversorromanos.model;

public class NumeroRomano {
	private char numeroRomano;
	private int numeroDecimal;
	
	

	public NumeroRomano(char numeroRomano, int numeroDecimal) {
		this.numeroRomano = numeroRomano;
		this.numeroDecimal = numeroDecimal;
	}

	public char getNumeroRomano() {
		return numeroRomano;
	}

	public int getNumeroDecimal() {
		return numeroDecimal;
	}

}
