package models;


public class Retangulo extends Forma {

	private int largura;

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	public Double calculaArea() {
		return Double.valueOf(getAltura() * getLargura());
	}

	@Override
	public String toString() {
		return super.toString() + "\nRet�ngulo, �rea: " + calculaArea() + "\n";
	}

}
