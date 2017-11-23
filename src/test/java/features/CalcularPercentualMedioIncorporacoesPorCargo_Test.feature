#Author: Dúnia Marchiori

@tag
Feature: Calcular percentual médio por cargo
 	Task II

  @tag1
  Scenario Outline: Média dos cargos
  # percentual médio dos registros ativos de cada cargo
    Given O cargo <cargo>
    And registros são ativo
    When Calcular percentual medio
    Then O resultado encontrado é <saida>

    Examples: 
      | cargo  													|  saida 	| 
      | "Diretor Geral Administrativo" 	|  12.67	| 
      | "Chefe de Divisão"						 	|   15 		|
      | "Chefe de Seção"						 		|  18.33 	|
      | "Diretor"						 						|   10 		|
      
