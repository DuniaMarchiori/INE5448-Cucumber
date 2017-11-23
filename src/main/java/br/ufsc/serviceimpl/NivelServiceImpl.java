package br.ufsc.serviceimpl;

import java.util.Collection;
import java.util.Map;

import br.ufsc.entity.Nivel;
import br.ufsc.service.NivelService;

public class NivelServiceImpl extends BaseEntityServiceImpl<Nivel> implements NivelService {

	@Override
	public Nivel getById(Long id) {
		Map<Long, Nivel> map = this.read(Nivel.class.getName());
		return map.get(id);
	}

	@Override
	public Collection<Nivel> getList() {
		Map<Long, Nivel> map = this.read(Nivel.class.getName());
		return map.values();
	}
	
	public Nivel getByPosicao(Integer posicao) {
		Map<Long, Nivel> map = this.read(Nivel.class.getName());
	    Collection<Nivel> list = map.values();
	    for(Nivel object : list) {
	    	if (object.getPosicao().equals(posicao)) {
	    		return object;
	    	}
	    }
	    return null;
	}
	
	public Nivel salvar(Nivel nivel) throws Exception {
		Nivel aux = this.getByPosicao(nivel.getPosicao());
		if(nivel.getId() == null && aux != null) {
			nivel.setId(aux.getId());
		}
		return super.salvar(nivel);
	}

}
