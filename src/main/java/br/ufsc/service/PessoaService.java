package br.ufsc.service;

import br.ufsc.entity.Pessoa;

public interface PessoaService extends BaseEntityService<Pessoa> {
	public Pessoa getByMatricula(Long matricula);
	public Pessoa getByCPF(String cpf);
	public Double getValorTetoSalarial(Pessoa pessoa);
	public Double getValorBaseVencimento(Pessoa pessoa);
	
}
