package mz.co.cedsif.conversorromanos.model;

public class NumeroRomano {
	private char numeroRomano;
	private int numeroDecimal;
	private int posicao;
	

	public NumeroRomano(char numeroRomano, int numeroDecimal, int posicao) {
		this.numeroRomano = numeroRomano;
		this.numeroDecimal = numeroDecimal;
		this.posicao = posicao;
	}

	public char getNumeroRomano() {
		return numeroRomano;
	}

	public int getNumeroDecimal() {
		return numeroDecimal;
	}

	public int getPosicao() {
		return posicao;
	}
}
