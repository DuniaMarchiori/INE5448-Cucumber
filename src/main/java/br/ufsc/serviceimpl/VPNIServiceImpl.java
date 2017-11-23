package br.ufsc.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import br.ufsc.entity.Cargo;
import br.ufsc.entity.Pessoa;
import br.ufsc.entity.TipoVPNI;
import br.ufsc.entity.VPNI;
import br.ufsc.service.VPNIService;
import br.ufsc.service.VencimentoService;

public class VPNIServiceImpl extends BaseEntityServiceImpl<VPNI> implements VPNIService{

	private VencimentoService vencimentoService = new VencimentoServiceImpl();
	
	@Override
	public VPNI getById(Long id) {
		Map<Long, VPNI> map = read(VPNI.class.getName());
		return map.get(id); 
	}

	@Override
	public Collection<VPNI> getList() {
		Map<Long, VPNI> map = read(VPNI.class.getName());
		return map.values(); 
	}
	
	
	public TipoVPNI getTipoVPNINovaVPNI(Pessoa pessoa) {
		int tipoUltimaVPNI = 0;
		for (VPNI vpni : this.getListVPNIporPessoa(pessoa)) {
			if(vpni.getTipo().getPcMaximoVPNI() > tipoUltimaVPNI) {
				tipoUltimaVPNI = vpni.getTipo().getPcMaximoVPNI();
			}
		}
		return new TipoVPNI(TipoVPNI.getProximoTipo(tipoUltimaVPNI));
	}
	
	public VPNI getUltimaVPNI(Pessoa pessoa) {
		for (VPNI vpni : this.getListVPNIporPessoa(pessoa)) {
			if(vpni.getFlgAtiva() == true) {
				return vpni;
			}
		}
		return null;
	}
	
	public List<VPNI> getListVPNIporPessoa(Pessoa pessoa){
		List<VPNI> list = new ArrayList<VPNI>();
		for (VPNI vpni : this.getList()) {
			if(vpni.getPessoa().getMatricula().equals(pessoa.getMatricula())) {
				list.add(vpni);
			}
		}
		
		return list;
	}
	
	public List<VPNI> getListVPNIPorCargo(Cargo cargo){
		List<VPNI> list = new ArrayList<VPNI>();
		for (VPNI vpni : this.getList()) {
			if(vpni.getCargoRefIncorporacao().getDescricao().equals(cargo.getDescricao())) {
				list.add(vpni);
			}
		}
		
		return list;
	}
	
	public Double getValorBaseCargoIncorporação(VPNI vpni) {
		return vencimentoService.getByGrupoOcupacionalNivelReferencia(vpni.getCargoRefIncorporacao().getGrupoOcupacional(), vpni.getNivelCargoRefIncorporacao(), vpni.getReferenciaCargoRefIncorporacao()).getVencimento();
	}
	
	private VPNI validarIncorporacao(VPNI vpni) throws Exception {
		TipoVPNI tipoVPNINova = this.getTipoVPNINovaVPNI(vpni.getPessoa());
		if (vpni.getPessoa() == null) {
			throw new Exception("É obrigatório informar a pessoa que é beneficiária da vantagem!");
		}
		
		if(vpni.getPessoa().getMatricula()==null) {
			throw new Exception("A matrícula não é válida. É necessário uma matrícula válida para cadastrar uma incorporação!");
		}
		
		if(vpni.getFlgAtiva()==false) {
			throw new Exception("Uma incorporação nova sempre deve ser 'ativa'.");
		}
		if (tipoVPNINova.getPcMaximoVPNI() == 0) {
			throw new Exception("A matrícula já chegou no limite de VPNI. Para alterações cadastre uma retificação!");
		}
		if(vpni.getTipo() != null) {
			if (vpni.getTipo().getPcMaximoVPNI() != tipoVPNINova.getPcMaximoVPNI()) {
				throw new Exception("Não é possível cadastrar um VPNI com percentual máximo de incorporação " + vpni.getTipo().getPcMaximoVPNI() + "% para a matrícula. O percentual máximo de incorporação para novos movimentos é " + tipoVPNINova.getPcMaximoVPNI() + ". Para corrigir uma vantagem já incorporada cadastre um movimento de retificação!");
			}
		} else {
			vpni.setTipo(tipoVPNINova);
		}
		
		if((vpni.getPercentualIncorporado()== null) || vpni.getPercentualIncorporado()== 0) {
			throw new Exception("É necessário informar um percentual a ser incorporado");
		}
		
		if(vpni.getPercentualIncorporado() > vpni.getTipo().getPcMaximoVPNI()) {
			throw new Exception("O percentual incorporado é maior do que o permitido para o tipo");
		}
		
		if(vpni.getCargoRefIncorporacao()==null || vpni.getNivelCargoRefIncorporacao() == null || vpni.getReferenciaCargoRefIncorporacao() == null) {
			throw new Exception("Não é possível cadastrar uma incorporação sem definir o Cargo, Nível e Referência referentes à incorporação.");
		}
		
		if(vencimentoService.getByGrupoOcupacionalNivelReferencia(vpni.getCargoRefIncorporacao().getGrupoOcupacional(), vpni.getNivelCargoRefIncorporacao(), vpni.getReferenciaCargoRefIncorporacao()) == null) {
			throw new Exception("Não é possível cadastrar a incorporação pois a combinação de Cargo, Nível e Referência informados não constam na Tabela de Vencimentos");
		}
		
		return vpni;
	}
	
	
	public VPNI salvar(VPNI vpni) throws Exception {
		VPNI novaVPNI;
		VPNI ultimaVPNI = this.getUltimaVPNI(vpni.getPessoa());
		if (vpni.getFlgRetificacao() == false) {
			novaVPNI = this.validarIncorporacao(vpni);
			novaVPNI = super.salvar(novaVPNI);
			if (novaVPNI.getId() != null) {
				if(ultimaVPNI != null) {
					ultimaVPNI.setFlgAtiva(false);
					super.salvar(ultimaVPNI);
				}
			}
		}
		return null;
	}

}
