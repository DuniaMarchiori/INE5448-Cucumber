package br.ufsc.entity;

import java.io.Serializable;

public class Referencia extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4663458182494879741L;

	private String letra = null;
	
	public Referencia() {
		
	}
	
	public Referencia(String letra) {
		this.setLetra(letra);
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}

}
