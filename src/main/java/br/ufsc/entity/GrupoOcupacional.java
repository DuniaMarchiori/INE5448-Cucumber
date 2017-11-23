package br.ufsc.entity;

import java.io.Serializable;

public class GrupoOcupacional extends BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -948524656922475812L;
	private String grupo = null;
	private Double tetoSalarial = null;

	public GrupoOcupacional() {
		
	}
	
	public GrupoOcupacional(String grupo, Double tetoSalarial) {
		this.setGrupo(grupo);
		this.setTetoSalarial(tetoSalarial);
	}
	
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Double getTetoSalarial() {
		return tetoSalarial;
	}

	public void setTetoSalarial(Double tetoSalarial) {
		this.tetoSalarial = tetoSalarial;
	}
}
