package br.ufsc.service;

import br.ufsc.entity.Nivel;

public interface NivelService extends BaseEntityService<Nivel> {
	public Nivel getByPosicao(Integer posicao);
}
