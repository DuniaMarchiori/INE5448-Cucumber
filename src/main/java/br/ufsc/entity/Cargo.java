package br.ufsc.entity;

import java.io.Serializable;

public class Cargo extends BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4172632953516005L;
	
	public Cargo() {
		
	}
	
	public Cargo(String descricao, GrupoOcupacional grupoOcupacional) {
		this.setDescricao(descricao);
		this.setGrupoOcupacional(grupoOcupacional);
	}
	
	private String descricao = null;
	private GrupoOcupacional grupoOcupacional = null;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public GrupoOcupacional getGrupoOcupacional() {
		return grupoOcupacional;
	}

	public void setGrupoOcupacional(GrupoOcupacional grupoOcupacional) {
		this.grupoOcupacional = grupoOcupacional;
	}
	
}
