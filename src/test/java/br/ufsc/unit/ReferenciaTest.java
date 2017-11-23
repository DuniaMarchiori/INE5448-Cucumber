package br.ufsc.unit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.ufsc.entity.Referencia;
import br.ufsc.service.ReferenciaService;
import br.ufsc.serviceimpl.ReferenciaServiceImpl;

public class ReferenciaTest {
	private ReferenciaService service = new ReferenciaServiceImpl();
	
	@Test
	public void inserirReferencia() {
		boolean sucesso = true;
		String message = "SUCESSO";
		
		List<Referencia> listReferencia = new ArrayList<Referencia>();
		listReferencia.add(new Referencia("A"));
		listReferencia.add(new Referencia("B"));
		listReferencia.add(new Referencia("C"));
		listReferencia.add(new Referencia("D"));
		listReferencia.add(new Referencia("E"));
		listReferencia.add(new Referencia("F"));
		listReferencia.add(new Referencia("G"));
		listReferencia.add(new Referencia("H"));
		listReferencia.add(new Referencia("I"));
		listReferencia.add(new Referencia("J"));
		
		for(Referencia referencia : listReferencia) {
			try {
				listReferencia.set(listReferencia.indexOf(referencia), service.salvar(referencia));
			} catch (Exception e) {
				sucesso = false;
				message = e.getMessage();
			}
		}
		
		assertEquals("SUCESSO", message);
		assertTrue(sucesso);
		
		
	}
}
