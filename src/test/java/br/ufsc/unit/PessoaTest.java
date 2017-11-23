package br.ufsc.unit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.ufsc.entity.Pessoa;
import br.ufsc.service.CargoService;
import br.ufsc.service.NivelService;
import br.ufsc.service.PessoaService;
import br.ufsc.service.ReferenciaService;
import br.ufsc.serviceimpl.CargoServiceImpl;
import br.ufsc.serviceimpl.NivelServiceImpl;
import br.ufsc.serviceimpl.PessoaServiceImpl;
import br.ufsc.serviceimpl.ReferenciaServiceImpl;

public class PessoaTest {
	
	private CargoService cargoService = new CargoServiceImpl();
	private NivelService nivelService = new NivelServiceImpl();
	private ReferenciaService referenciaService = new ReferenciaServiceImpl();
	private PessoaService service = new PessoaServiceImpl();
	
	@Test
	public void inserirPessoas() {
		String mensagem = "SUCESSO";
		List<Pessoa> listPessoa = new ArrayList<Pessoa>();
		listPessoa.add(new Pessoa("João da Silva"
				,"158.120.867-70"
				,(long)18282
				,cargoService.getByDescricao("Analista Administrativo")
				,nivelService.getByPosicao(11)
				,referenciaService.getByLetra("J")
				,cargoService.getByDescricao("Diretor Geral Administrativo")
				,nivelService.getByPosicao(1)
				,referenciaService.getByLetra("A")
				)
			);
		listPessoa.add(new Pessoa("Maria da Glória"
				,"735.635.629-54"
				,(long)33256
				,cargoService.getByDescricao("Analista de Sistemas")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("I")
				)
			);
		listPessoa.add(new Pessoa("Fabiana Hash"
				,"833.523.044-75"
				,(long)26969
				,cargoService.getByDescricao("Analista de Sistemas")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("H")
				,cargoService.getByDescricao("Diretor")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("A")
				)
			);
		listPessoa.add(new Pessoa("Luiz Pereira Oliveira"
				,"698.768.110-45"
				,(long)17365
				,cargoService.getByDescricao("Técnico Administrativo")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("J")
				,cargoService.getByDescricao("Chefe de Divisão")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				)
			);
		listPessoa.add(new Pessoa("Joana Moon"
				,"548.466.525-64"
				,(long)12658
				,cargoService.getByDescricao("Técnico de Sistemas de Informação")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("J")
				,cargoService.getByDescricao("Diretor")
				,nivelService.getByPosicao(10)
				,referenciaService.getByLetra("A")
				)
			);
		
		listPessoa.add(new Pessoa("Pedro Henrique Ribeiro"
				,"243.094.811-75"
				,(long)11325
				,cargoService.getByDescricao("Técnico Jurídico")
				,nivelService.getByPosicao(7)
				,referenciaService.getByLetra("C")
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				)
			);
		
		listPessoa.add(new Pessoa("Carlos Santana Livramento"
				,"236.325.648-41"
				,(long)56236
				,cargoService.getByDescricao("Técnico Jurídico")
				,nivelService.getByPosicao(9)
				,referenciaService.getByLetra("H")
				,cargoService.getByDescricao("Chefe de Seção")
				,nivelService.getByPosicao(3)
				,referenciaService.getByLetra("A")
				)
			);
		listPessoa.add(new Pessoa("Silvana Maria da Silva"
				,"624.911.648-68"
				,(long)1515
				,cargoService.getByDescricao("Analista de Sistemas")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("J")
				,cargoService.getByDescricao("Chefe de Divisão")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				)
			);
		listPessoa.add(new Pessoa("Bianca Vicente"
				,"161.200.187-43"
				,(long)6696
				,cargoService.getByDescricao("Analista Juridico")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("J")
				,cargoService.getByDescricao("Chefe de Divisão")
				,nivelService.getByPosicao(8)
				,referenciaService.getByLetra("A")
				)
			);
		
		listPessoa.add(new Pessoa("Carlos Eduardo Vicente"
				,"613.820.366-63"
				,(long)36696
				,cargoService.getByDescricao("Analista de Sistemas")
				,nivelService.getByPosicao(12)
				,referenciaService.getByLetra("J")
				)
			);
		
		
		for(Pessoa pessoa : listPessoa) {
			try {
					listPessoa.set(listPessoa.indexOf(pessoa), service.salvar(pessoa));
				
			} catch (Exception e) {
				mensagem = e.getMessage();
			}
		}
		
		assertEquals("SUCESSO",mensagem);
	}
	
	@Test
	public void imprimirPessoa() {
		System.out.print("\nDados de Pessoas");
		System.out.print("\nMatrícula \t\t Valor Base Vencimento \t\t Teto Salarial");
		for(Pessoa pessoa : service.getList()) {
			System.out.print("\n" + pessoa.getMatricula() + "\t\t" + service.getValorBaseVencimento(pessoa) + "\t\t" + service.getValorTetoSalarial(pessoa));
		}
	}
}
