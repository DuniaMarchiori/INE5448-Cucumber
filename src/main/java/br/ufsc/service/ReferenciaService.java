package br.ufsc.service;

import br.ufsc.entity.Referencia;

public interface ReferenciaService extends BaseEntityService<Referencia> {
	public Referencia getByLetra(String letra);
}
