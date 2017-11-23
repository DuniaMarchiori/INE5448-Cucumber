package br.ufsc.unit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import br.ufsc.entity.Vencimento;
import br.ufsc.service.GrupoOcupacionalService;
import br.ufsc.service.NivelService;
import br.ufsc.service.ReferenciaService;
import br.ufsc.service.VencimentoService;
import br.ufsc.serviceimpl.GrupoOcupacionalServiceImpl;
import br.ufsc.serviceimpl.NivelServiceImpl;
import br.ufsc.serviceimpl.ReferenciaServiceImpl;
import br.ufsc.serviceimpl.VencimentoServiceImpl;

public class VencimentoTest {
	
	private VencimentoService service = new VencimentoServiceImpl();
	private ReferenciaService referenciaService = new ReferenciaServiceImpl();
	private NivelService nivelService = new NivelServiceImpl();
	private GrupoOcupacionalService grupoOcupacionalService = new GrupoOcupacionalServiceImpl();
	
	@Test
	public void inserirVencimentos() {
		List<Vencimento> listVencimentos = new ArrayList<Vencimento>();
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("A")
				,3490.67));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("B")
				,3540.65));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("C")
				,3591.41));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("D")
				,3642.90));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("E")
				,3695.18));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("F")
				,3748.24));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("G")
				,3802.09));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("H")
				,3856.77));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("I")
				,3912.26));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("J")
				,3968.56));
		
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				,4025.73));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("B")
				,4083.75));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("C")
				,4142.63));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("D")
				,4202.41));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("E")
				,4263.08));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("F")
				,4324.66));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("G")
				,4387.15));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("H")
				,4450.60));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("I")
				,4515.00));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("J")
				,4580.37));
		
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("A")
				,4646.69));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("B")
				,4714.03));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("C")
				,4782.37));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("D")
				,4851.74));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("E")
				,4922.14));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("F")
				,4993.61));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("G")
				,5066.15));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("H")
				,5139.78));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("I")
				,5214.49));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("TJA")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("J")
				,5290.34));
		
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("A")
				,6008.82));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("B")
				,6102.44));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("C")
				,6197.50));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("D")
				,6294.20));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("E")
				,6392.37));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("F")
				,6492.13));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("G")
				,6593.48));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("H")
				,6696.45));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("I")
				,6801.07));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("J")
				,6907.35));
		
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("A")
				,7015.36));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("B")
				,7125.07));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("C")
				,7236.50));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("D")
				,7349.80));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("E")
				,7464.88));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("F")
				,7581.80));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("G")
				,7700.59));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("H")
				,7821.26));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("I")
				,7943.87));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("J")
				,8068.46));
		
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("A")
				,8195.03));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("B")
				,8323.62));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("C")
				,8454.20));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("D")
				,8587.02));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("E")
				,8721.89));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("F")
				,8858.92));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("G")
				,8998.13));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("H")
				,9139.57));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("I")
				,9283.28));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("ANS")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("J")
				,9429.29));
		
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("DASU")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("A")
				,16090.29));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("DASU")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				,12968.80));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("FG")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				,1590.38));
		listVencimentos.add(new Vencimento(grupoOcupacionalService.getByGrupo("DGA")
				,nivelService.getByPosicao(1)
				,referenciaService.getByLetra("A")
				,17507.00));
		
		String message = "SUCESSO";
		for(Vencimento vencimento : listVencimentos) {
			try {
				listVencimentos.set(listVencimentos.indexOf(vencimento), service.salvar(vencimento));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				message = e.getMessage();
			}
		}
		
		assertEquals("SUCESSO", message);
	}
	
	@Test
	public void imprimirVencimentos() {
		Collection<Vencimento> listVencimento = service.getList();
		for(Vencimento vencimento : listVencimento) {
			System.out.print("\n" + vencimento.getGrupoOcupacional().getGrupo());
			System.out.print("\t" + vencimento.getNivel().getPosicao());
			System.out.print("\t" + vencimento.getReferencia().getLetra());
			System.out.print("\t" + vencimento.getVencimento());
		}
	}
}
