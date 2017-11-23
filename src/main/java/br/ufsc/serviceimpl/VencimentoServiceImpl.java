package br.ufsc.serviceimpl;

import java.util.Collection;
import java.util.Map;

import br.ufsc.entity.GrupoOcupacional;
import br.ufsc.entity.Nivel;
import br.ufsc.entity.Referencia;
import br.ufsc.entity.Vencimento;
import br.ufsc.service.GrupoOcupacionalService;
import br.ufsc.service.NivelService;
import br.ufsc.service.ReferenciaService;
import br.ufsc.service.VencimentoService;

public class VencimentoServiceImpl extends BaseEntityServiceImpl<Vencimento> implements VencimentoService{

	private NivelService nivelService = new NivelServiceImpl();
	private ReferenciaService referenciaService = new ReferenciaServiceImpl();
	private GrupoOcupacionalService grupoOcupacionalService = new GrupoOcupacionalServiceImpl();
	
	@Override
	public Vencimento getById(Long id) {
		Map<Long, Vencimento> map = read(Vencimento.class.getName());
		return map.get(id); 
	}

	@Override
	public Collection<Vencimento> getList() {
		Map<Long, Vencimento> map = read(Vencimento.class.getName());
		return map.values(); 
	}
	
	public Vencimento getByGrupoOcupacionalNivelReferencia(GrupoOcupacional grupoOcupacional, Nivel nivel, Referencia referencia) {
		Map<Long, Vencimento> map = this.read(Vencimento.class.getName());
	    Collection<Vencimento> list = map.values();
	    for(Vencimento object : list) {
	    	if (object.getGrupoOcupacional().getGrupo().equals(grupoOcupacional.getGrupo())
	    				&& object.getNivel().getPosicao().equals(nivel.getPosicao())
	    				&& object.getReferencia().getLetra().equals(referencia.getLetra())) {
	    		return object;
	    	}
	    }
	    return null;
	}
	
	public Vencimento salvar(Vencimento vencimento) throws Exception {
		Vencimento aux = this.getByGrupoOcupacionalNivelReferencia(vencimento.getGrupoOcupacional(), vencimento.getNivel(), vencimento.getReferencia());
		if(vencimento.getId() == null && aux != null) {
			vencimento.setId(aux.getId());
		}
		
		GrupoOcupacional grupoOcupacional = null;
		if(vencimento.getGrupoOcupacional().getId() == null) {
			grupoOcupacional = grupoOcupacionalService.getByGrupo(vencimento.getGrupoOcupacional().getGrupo()); 
		} else {
			grupoOcupacional = grupoOcupacionalService.getById(vencimento.getGrupoOcupacional().getId());
		}
		if(grupoOcupacional == null ) {
			grupoOcupacional = grupoOcupacionalService.salvar(vencimento.getGrupoOcupacional());
		}
		vencimento.setGrupoOcupacional(grupoOcupacional);
		
		Nivel nivel = null;
		if(vencimento.getNivel().getId() == null) {
			nivel = nivelService.getByPosicao(vencimento.getNivel().getPosicao()); 
		} else {
			nivel = nivelService.getById(vencimento.getNivel().getId()); 
		}
		if(nivel == null ) {
			nivel = nivelService.salvar(vencimento.getNivel());
		}
		vencimento.setNivel(nivel);
		
		Referencia referencia = null;
		if(vencimento.getReferencia().getId() == null) {
			referencia = referenciaService.getByLetra(vencimento.getReferencia().getLetra());
		} else {
			referencia = referenciaService.getById(vencimento.getReferencia().getId()); 
		}
		
		if(referencia == null ) {
			referencia = referenciaService.salvar(vencimento.getReferencia());
		}
		vencimento.setReferencia(referencia);
		
		return super.salvar(vencimento);
	}

}
