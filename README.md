# Solid

##S
###Relatório da letra "S"
Analisando o código da pasta SSOLID, fiz algumas alterações para aplicar o conceito de responsabilidade única, visto que o código tinha duas funções na mesma classe, a função de processar a encomenda e salvar os dados em um arquivo, o que quebra a regra do solid.
Após a alteração, ficou uma classe separada só para processar as encomendas(ProcessarEncomendas.java) que na ocasião de receber novas funcionalidades e tipos de encomenda, por exemplo, lidaria de uma forma muito mais fácil, sem encontrar conflitos com a outra classe.
Com isso, a classe ProcessadorEncomendas passou a ter uma única responsabilidade: processar a entrada do usuário, calcular o frete e delegar a gravação dos dados para outra classe.
A segunda função(GravadorEncomendasEmArquivo.java) só para guardar o arquivo, fazendo com que alterações na outra classe não influenciam essa, prevenindo diversos erros futuros. Essa nova classe ficou responsável por salvar as informações da encomenda em um arquivo .txt.
Fiz sem utilizar uma main, pois acredito que dessa forma ficou bem explícito o significado desse conceito do solid, em que classes possuem apenas uma função com o objetivo de ser mais fácil de testar e manter.

##O

##L

##i

