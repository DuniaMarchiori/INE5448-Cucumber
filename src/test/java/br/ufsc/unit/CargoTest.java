package br.ufsc.unit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.ufsc.entity.Cargo;
import br.ufsc.service.CargoService;
import br.ufsc.service.GrupoOcupacionalService;
import br.ufsc.serviceimpl.CargoServiceImpl;
import br.ufsc.serviceimpl.GrupoOcupacionalServiceImpl;

public class CargoTest {

	private CargoService service = new CargoServiceImpl();
	private GrupoOcupacionalService grupoOcupacionalService = new GrupoOcupacionalServiceImpl();
		
	@Test
	public void inserirCargos() {
		String message = "SUCESSO";
		List<Cargo> listCargos = new ArrayList<Cargo>();
		listCargos.add(new Cargo("Analista de Sistemas",grupoOcupacionalService.getByGrupo("ANS")));
		listCargos.add(new Cargo("Analista Administrativo",grupoOcupacionalService.getByGrupo("ANS")));
		listCargos.add(new Cargo("Analista Juridico",grupoOcupacionalService.getByGrupo("ANS")));
		listCargos.add(new Cargo("Técnico de Sistemas de Informação",grupoOcupacionalService.getByGrupo("TJA")));
		listCargos.add(new Cargo("Técnico Administrativo",grupoOcupacionalService.getByGrupo("TJA")));
		listCargos.add(new Cargo("Técnico Jurídico",grupoOcupacionalService.getByGrupo("TJA")));
		listCargos.add(new Cargo("Diretor Geral Administrativo",grupoOcupacionalService.getByGrupo("DGA")));
		listCargos.add(new Cargo("Diretor",grupoOcupacionalService.getByGrupo("DASU")));
		listCargos.add(new Cargo("Chefe de Divisão",grupoOcupacionalService.getByGrupo("DASU")));
		listCargos.add(new Cargo("Chefe de Seção",grupoOcupacionalService.getByGrupo("FG")));
		
		for(Cargo cargo : listCargos) {
			try {
				listCargos.set(listCargos.indexOf(cargo), service.salvar(cargo));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				message = e.getMessage();
			}
		}
		
		assertEquals("SUCESSO",message);
		assertEquals(listCargos.size(), service.getList().size());
	}

}
