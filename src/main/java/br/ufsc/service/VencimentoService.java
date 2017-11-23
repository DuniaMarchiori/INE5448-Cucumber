package br.ufsc.service;

import br.ufsc.entity.GrupoOcupacional;
import br.ufsc.entity.Nivel;
import br.ufsc.entity.Referencia;
import br.ufsc.entity.Vencimento;

public interface VencimentoService extends BaseEntityService<Vencimento> {
	public Vencimento getByGrupoOcupacionalNivelReferencia(GrupoOcupacional grupoOcupacional, Nivel nivel, Referencia referencia);
}
