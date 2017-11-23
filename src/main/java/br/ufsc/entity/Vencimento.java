package br.ufsc.entity;

import java.io.Serializable;

public class Vencimento extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5099018793236122534L;

	private GrupoOcupacional grupoOcupacional = null;
	private Nivel nivel = null;
	private Referencia referencia = null;
	private Double vencimento = null;
	
	public Vencimento() {
		
	}
	
	public Vencimento(GrupoOcupacional grupoOcupacional, Nivel nivel, Referencia referencia, Double vencimento) {
		this.setGrupoOcupacional(grupoOcupacional);
		this.setNivel(nivel);
		this.setReferencia(referencia);
		this.setVencimento(vencimento);
	}
	
	
	public GrupoOcupacional getGrupoOcupacional() {
		return grupoOcupacional;
	}
	public void setGrupoOcupacional(GrupoOcupacional grupoOcupacional) {
		this.grupoOcupacional = grupoOcupacional;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public Referencia getReferencia() {
		return referencia;
	}
	public void setReferencia(Referencia referencia) {
		this.referencia = referencia;
	}
	public Double getVencimento() {
		return vencimento;
	}
	public void setVencimento(Double vencimento) {
		this.vencimento = vencimento;
	}

}
