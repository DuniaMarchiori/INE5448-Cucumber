package br.ufsc.entity;

import java.io.Serializable;

public class VPNI extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4201469154950679822L;

	private TipoVPNI tipo = null;
	private Pessoa pessoa = null;
	private Double percentualIncorporado = null;
	private VPNI retificao = null;
	private Boolean flgRetificacao = null;
	private Boolean flgAtiva = null;
	private Cargo cargoRefIncorporacao = null;
	private Nivel nivelCargoRefIncorporacao = null;
	private Referencia referenciaCargoRefIncorporacao = null;

	public VPNI() {
		
	}
	
	public VPNI(TipoVPNI tipo, Pessoa pessoa, Double percentualIncorporado, Cargo cargoRefIncorporacao, Nivel nivelCargoRefIncorporacao, Referencia referenciaCargoRefIncorporacao) {
		this.setTipo(tipo);
		this.setPessoa(pessoa);
		this.setPercentualIncorporado(percentualIncorporado);
		this.setCargoRefIncorporacao(cargoRefIncorporacao);
		this.setNivelCargoRefIncorporacao(nivelCargoRefIncorporacao);
		this.setReferenciaCargoRefIncorporacao(referenciaCargoRefIncorporacao);
		this.setFlgRetificacao(false);
		this.setFlgAtiva(true);
	}
	
	public VPNI(TipoVPNI tipo, Pessoa pessoa, Double percentualIncorporado, Cargo cargoRefIncorporacao, Nivel nivelCargoRefIncorporacao, Referencia referenciaCargoRefIncorporacao,  VPNI retificacao) {
		this.setTipo(tipo);
		this.setPessoa(pessoa);
		this.setPercentualIncorporado(percentualIncorporado);
		this.setCargoRefIncorporacao(cargoRefIncorporacao);
		this.setNivelCargoRefIncorporacao(nivelCargoRefIncorporacao);
		this.setReferenciaCargoRefIncorporacao(referenciaCargoRefIncorporacao);
		this.setRetificao(retificacao);
		this.setFlgRetificacao(false);
		this.setFlgAtiva(true);
	}
	
	public VPNI(TipoVPNI tipo, Pessoa pessoa, Double percentualIncorporado, Cargo cargoRefIncorporacao, Nivel nivelCargoRefIncorporacao, Referencia referenciaCargoRefIncorporacao, VPNI retificacao, Boolean flgRetificacao) {
		this.setTipo(tipo);
		this.setPessoa(pessoa);
		this.setPercentualIncorporado(percentualIncorporado);
		this.setCargoRefIncorporacao(cargoRefIncorporacao);
		this.setNivelCargoRefIncorporacao(nivelCargoRefIncorporacao);
		this.setReferenciaCargoRefIncorporacao(referenciaCargoRefIncorporacao);
		this.setRetificao(retificacao);
		this.setFlgRetificacao(flgRetificacao);
		this.setFlgAtiva(true);
	}
	
	public TipoVPNI getTipo() {
		return tipo;
	}
	public void setTipo(TipoVPNI tipo) {
		this.tipo = tipo;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Double getPercentualIncorporado() {
		return percentualIncorporado;
	}
	public void setPercentualIncorporado(Double percentualIncorporado) {
		this.percentualIncorporado = percentualIncorporado;
	}
	public VPNI getRetificao() {
		return retificao;
	}
	public void setRetificao(VPNI retificao) {
		this.retificao = retificao;
	}

	public boolean getFlgAtiva() {
		return flgAtiva;
	}

	public void setFlgAtiva(Boolean b) {
		this.flgAtiva = b;
	}

	public Cargo getCargoRefIncorporacao() {
		return cargoRefIncorporacao;
	}

	public void setCargoRefIncorporacao(Cargo cargoRefIncorporacao) {
		this.cargoRefIncorporacao = cargoRefIncorporacao;
	}

	public Nivel getNivelCargoRefIncorporacao() {
		return nivelCargoRefIncorporacao;
	}

	public void setNivelCargoRefIncorporacao(Nivel nivelCargoRefIncorporacao) {
		this.nivelCargoRefIncorporacao = nivelCargoRefIncorporacao;
	}

	public Referencia getReferenciaCargoRefIncorporacao() {
		return referenciaCargoRefIncorporacao;
	}

	public void setReferenciaCargoRefIncorporacao(Referencia referenciaCargoRefIncorporacao) {
		this.referenciaCargoRefIncorporacao = referenciaCargoRefIncorporacao;
	}

	public Boolean getFlgRetificacao() {
		return flgRetificacao;
	}

	public void setFlgRetificacao(boolean b) {
		this.flgRetificacao = b;
	}


}
