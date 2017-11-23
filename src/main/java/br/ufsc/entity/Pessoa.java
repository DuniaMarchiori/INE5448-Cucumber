package br.ufsc.entity;

import java.io.Serializable;

public class Pessoa extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6959210734522919948L;

	private String nome = null;
	private String cpf = null;
	private Long matricula = null;
	private Cargo cargo = null;
	private Nivel nivel = null;
	private Referencia referencia = null;
	private Cargo cargoComssionado = null;
	private Nivel nivelCargoComissionado = null;
	private Referencia referenciaCargoComissionado = null;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, Long matricula, Cargo cargo, Nivel nivel, Referencia referencia) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setMatricula(matricula);
		this.setCargo(cargo);
		this.setNivel(nivel);
		this.setReferencia(referencia);
	}

	public Pessoa(String nome, String cpf, Long matricula, Cargo cargo, Nivel nivel, Referencia referencia, Cargo cargoComissionado, Nivel nivelCargoComissionado, Referencia referenciaCargoComissionado) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setMatricula(matricula);
		this.setCargo(cargo);
		this.setNivel(nivel);
		this.setReferencia(referencia);
		this.setNivelCargoComissionado(nivelCargoComissionado);
		this.setCargoComssionado(cargoComissionado);
		this.setReferenciaCargoComissionado(referenciaCargoComissionado);
	}
	
	public Cargo getCargoComssionado() {
		return cargoComssionado;
	}

	public void setCargoComssionado(Cargo cargoComssionado) {
		this.cargoComssionado = cargoComssionado;
	}

	public Nivel getNivelCargoComissionado() {
		return nivelCargoComissionado;
	}

	public void setNivelCargoComissionado(Nivel nivelCargoComissionado) {
		this.nivelCargoComissionado = nivelCargoComissionado;
	}

	public Referencia getReferenciaCargoComissionado() {
		return referenciaCargoComissionado;
	}

	public void setReferenciaCargoComissionado(Referencia referenciaCargoComissionado) {
		this.referenciaCargoComissionado = referenciaCargoComissionado;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
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

}
