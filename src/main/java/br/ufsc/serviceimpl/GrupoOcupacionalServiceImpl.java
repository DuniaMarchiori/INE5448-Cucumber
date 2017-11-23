package br.ufsc.serviceimpl;

import java.util.Collection;
import java.util.Map;

import br.ufsc.entity.GrupoOcupacional;
import br.ufsc.service.GrupoOcupacionalService;

public class GrupoOcupacionalServiceImpl extends BaseEntityServiceImpl<GrupoOcupacional> implements GrupoOcupacionalService{

	@Override
	public Collection<GrupoOcupacional> getList() {
		Map<Long, GrupoOcupacional> map = this.read(GrupoOcupacional.class.getName());
		return map.values();
	}

	@Override
	public GrupoOcupacional getById(Long id) {
		Map<Long, GrupoOcupacional> map = this.read(GrupoOcupacional.class.getName());
		return map.get(id);
	}
	
	public GrupoOcupacional getByGrupo(String grupo) {
		Map<Long, GrupoOcupacional> map = this.read(GrupoOcupacional.class.getName());
	    Collection<GrupoOcupacional> list = map.values();
	    for(GrupoOcupacional object : list) {
	    	if (object.getGrupo().equals(grupo)) {
	    		return object;
	    	}
	    }
	    return null;
	}
	
	public GrupoOcupacional salvar(GrupoOcupacional grupoOcupacional) throws Exception {
		GrupoOcupacional aux = this.getByGrupo(grupoOcupacional.getGrupo());
		if(grupoOcupacional.getId() == null && aux != null) {
			grupoOcupacional.setId(aux.getId());
		}
		return super.salvar(grupoOcupacional);
	}

}
