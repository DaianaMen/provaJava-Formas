package models;

public class Triangulo extends Forma {

	private int base;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public Double calculaArea() {
		return Double.valueOf((getBase() * getAltura()) / 2);
	}

	@Override
	public String toString() {
		return super.toString() + "\nTriângulo, área: " + calculaArea() + "\n";
	}

}