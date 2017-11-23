package br.ufsc.service;

import br.ufsc.entity.GrupoOcupacional;

public interface GrupoOcupacionalService extends BaseEntityService<GrupoOcupacional>{
	public GrupoOcupacional getByGrupo(String grupo);

}
