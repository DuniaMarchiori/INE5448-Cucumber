package br.ufsc.unit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.ufsc.entity.GrupoOcupacional;
import br.ufsc.service.GrupoOcupacionalService;
import br.ufsc.serviceimpl.GrupoOcupacionalServiceImpl;

public class GrupoOcupacionalTest {
	private GrupoOcupacionalService service = new GrupoOcupacionalServiceImpl();
	
	@Test 
	public void inserirGruposOcupacionais() {
		boolean sucesso = true;
		String message = "SUCESSO";
		List<GrupoOcupacional> listGrupoOcupacional = new ArrayList<GrupoOcupacional>();
		listGrupoOcupacional.add(new GrupoOcupacional("ANS",24294.62));
		listGrupoOcupacional.add(new GrupoOcupacional("TJA",6008.82));
		listGrupoOcupacional.add(new GrupoOcupacional("FG",16090.29));
		listGrupoOcupacional.add(new GrupoOcupacional("DASU",24294.62));
		listGrupoOcupacional.add(new GrupoOcupacional("DGA",24294.62));
	
		for(GrupoOcupacional grupoOcupacional : listGrupoOcupacional) {
			try {
				listGrupoOcupacional.set(listGrupoOcupacional.indexOf(grupoOcupacional), service.salvar(grupoOcupacional));
			} catch (Exception e) {
				sucesso = false;
				message = e.getMessage();
			}
			if (sucesso && grupoOcupacional.getId() == null) {
				
			}
		}
		assertEquals("SUCESSO", message);
		assertTrue(sucesso);
		
		
	}
}
