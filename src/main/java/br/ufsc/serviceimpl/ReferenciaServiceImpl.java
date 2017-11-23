package br.ufsc.serviceimpl;

import java.util.Collection;
import java.util.Map;

import br.ufsc.entity.Referencia;
import br.ufsc.service.ReferenciaService;

public class ReferenciaServiceImpl extends BaseEntityServiceImpl<Referencia> implements ReferenciaService{

	@Override
	public Referencia getById(Long id) {
		Map<Long, Referencia> map = this.read(Referencia.class.getName());
		return map.get(id);
	}

	@Override
	public Collection<Referencia> getList() {
		Map<Long, Referencia> map = this.read(Referencia.class.getName());
		return map.values();
	}
	
	public Referencia getByLetra(String letra) {
		Map<Long, Referencia> map = this.read(Referencia.class.getName());
	    Collection<Referencia> list = map.values();
	    for(Referencia object : list) {
	    	if (object.getLetra().equals(letra)) {
	    		return object;
	    	}
	    }
	    return null;
	}
	
	public Referencia salvar(Referencia referencia) throws Exception {
		Referencia aux = this.getByLetra(referencia.getLetra());
		if(referencia.getId() == null && aux != null) {
			referencia.setId(aux.getId());
		}
		return super.salvar(referencia);
	}

}
