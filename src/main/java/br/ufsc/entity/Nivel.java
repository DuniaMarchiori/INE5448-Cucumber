package br.ufsc.entity;

import java.io.Serializable;

public class Nivel extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6546804458728312472L;

	private Integer posicao = null;
	
	public Nivel () {
		
	}
	
	public Nivel (Integer posicao) {
		this.setPosicao(posicao);
	}
	
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

}
