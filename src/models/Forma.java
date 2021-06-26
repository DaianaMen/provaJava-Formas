package models;

import java.util.Date;

public  abstract class Forma {
	
	public Forma() {
		setCriadoEm(new Date());
	}
	
	private int id;
	private Date criadoEm;
	private int altura;
	
	public abstract Double calculaArea();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
