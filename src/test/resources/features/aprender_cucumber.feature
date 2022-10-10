# language: pt
#encoding: UTF-8

Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critério de aceitação

  Cenário: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executa-lo
    Entao a especificacao deve finalizar com sucesso

  @tipo1
  Cenário: Deve incrementar contador
    Dado que o valor do contador é 123
    Quando eu incrementar em 35
    Entao o valor do contador será 158

  @tipo2
  Cenário: Deve calcular atraso na entrega
    Dado que a entrega eh dia 05/04/2023
    Quando a entrega atrasar em 2 dias
    Entao a entrega serah efetuada em 07/04/2023

  @tipo1 @tipo2
  Cenário: Deve calcular atraso na entrega China
    Dado que a entrega eh dia 05/04/2023
    Quando a entrega atrasar em 2 meses
    Entao a entrega serah efetuada em 05/06/2023

  Cenário: Deve criar steps genéricos para estes passos
      Dado que o ticket é AF345
      Dado que o valor da passagem é R$ 230.45
      Dado que o nome do passageiro é "Fulano da Silva"
      Dado que o telefone do passageiro é 9999-9999
      Quando criar os steps
      Entao o teste vai funcionar

  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
      Dado que o ticket é AB167
      Dado que o ticket especial é AB167
      Dado que o valor da passagem é R$ 1120.23
      Dado que o nome do passageiro é "Cicrano de Oliveira"
      Dado que o telefone do passageiro é 9888-8888

  @ignore
  Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
      Dado que o ticket é CD123
      Dado que o ticket é AG1234
      Dado que o valor da passagem é R$ 11345.56
      Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
      Dado que o telefone do passageiro é 1234-5678
      Dado que o telefone do passageiro é 999-2223
