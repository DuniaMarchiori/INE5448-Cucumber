package br.ufsc.service;

import java.util.List;

import br.ufsc.entity.Cargo;
import br.ufsc.entity.Pessoa;
import br.ufsc.entity.TipoVPNI;
import br.ufsc.entity.VPNI;

public interface VPNIService extends BaseEntityService<VPNI> {
	public TipoVPNI getTipoVPNINovaVPNI(Pessoa pessoa);
	public VPNI getUltimaVPNI(Pessoa pessoa);
	public List<VPNI> getListVPNIporPessoa(Pessoa pessoa);
	public List<VPNI> getListVPNIPorCargo(Cargo cargo);
	public Double getValorBaseCargoIncorporação(VPNI vpni);
}
