package models;

public class Circulo extends Forma {
	
	private int raio;
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public Double calculaArea() {
		return Math.PI * Math.pow(getRaio(), 2);
	}

	@Override
	public String toString() {
		return super.toString() + "\nC�rculo, �rea " + calculaArea() + "\n";
	}
}