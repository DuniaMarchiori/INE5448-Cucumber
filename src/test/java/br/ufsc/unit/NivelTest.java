package br.ufsc.unit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.ufsc.entity.Nivel;
import br.ufsc.service.NivelService;
import br.ufsc.serviceimpl.NivelServiceImpl;

public class NivelTest {
	private NivelService service = new NivelServiceImpl();
	
	@Test 
	public void inserirNiveis() {
		boolean sucesso = true;
		String message = "SUCESSO";
		List<Nivel> listNivel = new ArrayList<Nivel>();
		listNivel.add(new Nivel(1));
		listNivel.add(new Nivel(3));
		listNivel.add(new Nivel(6));
		listNivel.add(new Nivel(7));
		listNivel.add(new Nivel(8));
		listNivel.add(new Nivel(9));
		listNivel.add(new Nivel(10));
		listNivel.add(new Nivel(11));
		listNivel.add(new Nivel(12));
		
		for(Nivel nivel : listNivel) {
			try {
				listNivel.set(listNivel.indexOf(nivel), service.salvar(nivel));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				sucesso = false;
				message = e.getMessage();
			}
		}
		
		assertEquals("SUCESSO", message);
		assertTrue(sucesso);
		
		
	}
}
