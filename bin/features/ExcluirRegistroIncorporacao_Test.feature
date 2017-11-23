#Author: Dúnia Marchiori

@tag
Feature: Excluir Registro de Incorporação
  Task I

  @tag1
  Scenario Outline: Exclusão de registro ativo sem registro anterior
  # registros ativos e com tipo 10
    Given A matricula <matricula>
    When Excluir o registro
    Then O registro é excluído com sucesso
    
    Examples:
    | matricula |
    |		18282		|
    |		33256		|
    |		26969		|
    |		17365		|
    |		12658		|
    |		11325		|
    
    
  @tag2
  Scenario Outline: Exclusão de registro ativo com registro anterior que não é retificação
  # registros ativos e com tipo diferente de 10
	  Given A matricula <matricula>
	  When Excluir o registro
	  Then O registro com matricula <matricula>
	  And com o tipoVPN <tipo>
	  And ativo é alterado para "true"
	  And O registro anterior é excluído com sucesso
	  
	  Examples:
	  | matricula | tipoVPN |
	  |		56236		|		10	 	|
	  |		1515		|		10		|
	  |		6696		|		20		|
	  |		36696		|		10		|
	    
	  
	@tag3
	Scenario: Exclusão de registro ativo com registro anterior que é retificação
	# não há exemplo de registro com retificação no banco,
	# assim é preciso cadastrar o registro abaixo como uma forma de "setup" pro teste
	Given A matricula 36696
	And o tipo VPN é 20
	And o cargo é "Diretor Geral Administrativo"
	And o percentual incorporado é 20  # a retificação está sendo feita para modificar o percentual incorporado desse registro (anteriormente o valor é 18)
	And o valor base é 9429.29
	And o valor teto é 16090.29
	And o valor base do cargo é 17507.0
	And o registro é uma retificação   # é necessário ter uma referência pro registro anterior
  When Excluir o registro  
  Then O registro com matricula 36696
  And e com o tipo 20
  And e com ativo igual a "false"
  And ativo é alterado para "true"
  And retificacao é alterada para "null"  #apaga a referência para a retificação que vai ser excluída
  And O registro anterior é excluído com sucesso
    
