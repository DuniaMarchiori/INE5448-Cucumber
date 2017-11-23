package br.ufsc.service;

import br.ufsc.entity.Cargo;

public interface CargoService extends BaseEntityService<Cargo> {

	public Cargo getByDescricao(String descricao);

}
