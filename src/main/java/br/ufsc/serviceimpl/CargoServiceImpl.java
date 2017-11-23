package br.ufsc.serviceimpl;

import java.util.Collection;
import java.util.Map;

import br.ufsc.entity.Cargo;
import br.ufsc.entity.GrupoOcupacional;
import br.ufsc.service.CargoService;
import br.ufsc.service.GrupoOcupacionalService;

public class CargoServiceImpl extends BaseEntityServiceImpl<Cargo> implements CargoService{

	private GrupoOcupacionalService grupoOcupacionalService = new GrupoOcupacionalServiceImpl();
	
	@Override
	public Cargo getById(Long id) {
		Map<Long, Cargo> map = this.read(Cargo.class.getName());
		return map.get(id);
	}
	
	public Cargo getByDescricao(String descricao) {
		Map<Long, Cargo> map = this.read(Cargo.class.getName());
	    Collection<Cargo> listCargos = map.values();
	    for(Cargo cargo : listCargos) {
	    	if (cargo.getDescricao().equals(descricao)) {
	    		return cargo;
	    	}
	    }
	    return null;
	}

	public Cargo salvar(Cargo cargo) throws Exception {
		Cargo aux = this.getByDescricao(cargo.getDescricao());
		if(cargo.getId() == null && aux != null) {
			cargo.setId(aux.getId());
		}
		
		GrupoOcupacional grupoOcupacional = null;
		if (cargo.getGrupoOcupacional().getId() == null) {
			grupoOcupacional = grupoOcupacionalService.getByGrupo(cargo.getGrupoOcupacional().getGrupo());
		} else {
			grupoOcupacional = grupoOcupacionalService.getById(cargo.getGrupoOcupacional().getId());
		}
		if(grupoOcupacional == null) {
			 grupoOcupacional = grupoOcupacionalService.salvar(cargo.getGrupoOcupacional());
		} 
		
		cargo.setGrupoOcupacional(grupoOcupacional);
		return super.salvar(cargo);
	}

	@Override
	public Collection<Cargo> getList() {
		Map<Long, Cargo> mapEntity = this.read(Cargo.class.getName());
		return mapEntity.values();
	
	}


}
