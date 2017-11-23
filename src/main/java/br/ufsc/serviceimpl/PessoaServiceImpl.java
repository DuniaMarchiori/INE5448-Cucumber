package br.ufsc.serviceimpl;

import java.util.Collection;
import java.util.Map;

import br.ufsc.entity.Pessoa;
import br.ufsc.entity.Vencimento;
import br.ufsc.service.PessoaService;
import br.ufsc.service.VencimentoService;

public class PessoaServiceImpl extends BaseEntityServiceImpl<Pessoa> implements PessoaService{

	private VencimentoService vencimentoService = new VencimentoServiceImpl();
	
	@Override
	public Pessoa getById(Long id) {
		Map<Long, Pessoa> map = this.read(Pessoa.class.getName());
		return map.get(id);
	}
	
	public Pessoa getByMatricula(Long matricula) {
		for(Pessoa pessoa : this.getList()) {
			if(pessoa.getMatricula().equals(matricula)) {
				return pessoa;
			}
		}
		return null;
	}
	
	public Pessoa getByCPF(String cpf) {
		for(Pessoa pessoa : this.getList()) {
			if(pessoa.getCpf().equals(cpf)) {
				return pessoa;
			}
		}
		return null;
	}

	public Double getValorTetoSalarial(Pessoa pessoa) {
		Double valorTetoCargo = pessoa.getCargo().getGrupoOcupacional().getTetoSalarial();
		Double valorTetoCargoComissionado = 0.00;
		if (pessoa.getCargoComssionado() != null) {
			valorTetoCargoComissionado = pessoa.getCargoComssionado().getGrupoOcupacional().getTetoSalarial();
		}
		
		if (valorTetoCargoComissionado > valorTetoCargo) {
			return valorTetoCargoComissionado;
		} 
		
		return valorTetoCargo;
	}
	
	public Double getValorBaseVencimento(Pessoa pessoa) {
		Double valorBaseCargo = vencimentoService.getByGrupoOcupacionalNivelReferencia(pessoa.getCargo().getGrupoOcupacional(), pessoa.getNivel(), pessoa.getReferencia()).getVencimento();
		Double valorBaseCargoComissionado = 0.0;
		if (pessoa.getCargoComssionado() != null) {
			valorBaseCargoComissionado = vencimentoService.getByGrupoOcupacionalNivelReferencia(pessoa.getCargoComssionado().getGrupoOcupacional(), pessoa.getNivelCargoComissionado(), pessoa.getReferenciaCargoComissionado()).getVencimento();
		}
		
		if ((valorBaseCargo + valorBaseCargoComissionado) > this.getValorTetoSalarial(pessoa)) {
			return this.getValorTetoSalarial(pessoa);
		} 
		
		return (valorBaseCargo + valorBaseCargoComissionado);
	}
	
	@Override
	public Collection<Pessoa> getList() {
		Map<Long, Pessoa> map = this.read(Pessoa.class.getName());
		return map.values();
	}
	
	@Override
	public Pessoa salvar(Pessoa pessoa) throws Exception {
		Pessoa aux;
		if(pessoa.getId() == null) {
			if(pessoa.getCpf() == null || pessoa.getMatricula() == null) {
				throw new Exception("Informe um número de CPF e Matrícula para Pessoa");
			}
			
			if(getByCPF(pessoa.getCpf())!=null) {
				throw new Exception("Este CPF já está cadastrado!");
			}
			
			if(getByMatricula(pessoa.getMatricula())!=null) {
				throw new Exception("Matricula já cadastrada!");
			}
			
			if(pessoa.getCargo()==null || pessoa.getReferencia() == null || pessoa.getNivel() == null) {
				throw new Exception("Toda matrícula deve ter Cargo, Nivel e Referência associado!");
			}
		} else {
			aux = this.getById(pessoa.getId());
			if(!(aux.getMatricula().equals(pessoa.getMatricula()) && aux.getCpf().equals(pessoa.getCpf()))){
				throw new Exception("Não é permitido alterar o CPF ou Matrícula de uma Pessoa já cadastrada!");
			}
		}
		
		pessoa = super.salvar(pessoa);
		return pessoa;
	}

}
