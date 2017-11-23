package br.ufsc.unit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.ufsc.entity.TipoVPNI;
import br.ufsc.entity.VPNI;
import br.ufsc.service.CargoService;
import br.ufsc.service.NivelService;
import br.ufsc.service.PessoaService;
import br.ufsc.service.ReferenciaService;
import br.ufsc.service.VPNIService;
import br.ufsc.serviceimpl.CargoServiceImpl;
import br.ufsc.serviceimpl.NivelServiceImpl;
import br.ufsc.serviceimpl.PessoaServiceImpl;
import br.ufsc.serviceimpl.ReferenciaServiceImpl;
import br.ufsc.serviceimpl.VPNIServiceImpl;

public class VPNITest {
	
	private VPNIService service = new VPNIServiceImpl();
	private PessoaService pessoaService = new PessoaServiceImpl();
	private CargoService cargoService = new CargoServiceImpl();
	private NivelService nivelService = new NivelServiceImpl();
	private ReferenciaService referenciaService = new ReferenciaServiceImpl();
	
	@Test
	public void incluirRegistroVPNI() {
		List<VPNI> lista = new ArrayList<VPNI>();
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)18282)
				,10.00
				,cargoService.getByDescricao("Diretor Geral Administrativo")
				,nivelService.getByPosicao(1)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)33256)
				,10.00
				,cargoService.getByDescricao("Chefe de Divisão")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)26969)
				,10.00
				,cargoService.getByDescricao("Diretor Geral Administrativo")
				,nivelService.getByPosicao(1)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)17365)
				,10.00
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)12658)
				,10.00
				,cargoService.getByDescricao("Diretor")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)11325)
				,10.00
				,cargoService.getByDescricao("Diretor")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)56236)
				,10.00
				,cargoService.getByDescricao("Chefe de Divisão")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)1515)
				,10.00
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)6696)
				,10.00
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_10)
				,pessoaService.getByMatricula((long)36696)
				,10.00
				,cargoService.getByDescricao("Diretor Geral Administrativo")
				,nivelService.getByPosicao(1)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_20)
				,pessoaService.getByMatricula((long)56236)
				,20.00
				,cargoService.getByDescricao("Chefe de Divisão")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_20)
				,pessoaService.getByMatricula((long)1515)
				,15.00
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_20)
				,pessoaService.getByMatricula((long)6696)
				,20.00
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_20)
				,pessoaService.getByMatricula((long)36696)
				,18.00
				,cargoService.getByDescricao("Diretor Geral Administrativo")
				,nivelService.getByPosicao(1)
				,referenciaService.getByLetra("A")
				));
		
		lista.add(new VPNI(
				new TipoVPNI(TipoVPNI.VPNI_30)
				,pessoaService.getByMatricula((long)6696)
				,30.00
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				));
		
		for(VPNI vpni : lista) {
			try {
				lista.set(lista.indexOf(vpni), service.salvar(vpni));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(VPNI vpni : service.getList()) {
			System.out.print("\n" + vpni.getId());
			System.out.print("\t" + vpni.getPessoa().getMatricula());
			System.out.print("\t" + vpni.getTipo().getPcMaximoVPNI());
			System.out.print("\t" + vpni.getCargoRefIncorporacao().getDescricao());
			System.out.print("\t" + vpni.getPercentualIncorporado());
			System.out.print("\t" + pessoaService.getValorBaseVencimento(vpni.getPessoa()));
			System.out.print("\t" + pessoaService.getValorTetoSalarial(vpni.getPessoa()));
			System.out.print("\t" + service.getValorBaseCargoIncorporação(vpni));
			System.out.print("\t" + vpni.getFlgAtiva());
			System.out.print("\t" + vpni.getFlgRetificacao());
			if (vpni.getRetificao()!=null) {
				System.out.print("\t" + vpni.getRetificao().getId());
			} else {
				System.out.print("\t");
			}
			
		}
	}
}
