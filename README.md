### Alunos: Eduardo Bolotari, Gabriel Fiori, Nicolas Berbert


# Solid

## S
### Relatório da letra "S"
Analisando o código da pasta SSOLID, fiz algumas alterações para aplicar o conceito de responsabilidade única, visto que o código tinha duas funções na mesma classe, a função de processar a encomenda e salvar os dados em um arquivo, o que quebra a regra do solid.
Após a alteração, ficou uma classe separada só para processar as encomendas(ProcessarEncomendas.java) que na ocasião de receber novas funcionalidades e tipos de encomenda, por exemplo, lidaria de uma forma muito mais fácil, sem encontrar conflitos com a outra classe.
Com isso, a classe ProcessadorEncomendas passou a ter uma única responsabilidade: processar a entrada do usuário, calcular o frete e delegar a gravação dos dados para outra classe.
A segunda função(GravadorEncomendasEmArquivo.java) só para guardar o arquivo, fazendo com que alterações na outra classe não influenciam essa, prevenindo diversos erros futuros. Essa nova classe ficou responsável por salvar as informações da encomenda em um arquivo .txt.
Fiz sem utilizar uma main, pois acredito que dessa forma ficou bem explícito o significado desse conceito do solid, em que classes possuem apenas uma função com o objetivo de ser mais fácil de testar e manter.

## O
### Relatório da letra "O"
A classe SistemaPagamento foi refatorada com base no princípio Open/Closed do SOLID, que propõe que classes devem estar abertas para extensão, mas fechadas para modificação. No código original, utilizava-se uma estrutura if-else para tratar diferentes métodos de pagamento, o que tornava o sistema rígido e difícil de escalar. A solução foi criar a interface MetodoPagamento, que define um contrato único para todos os tipos de pagamento. A partir dela, foram criadas classes como PagamentoCartao, PagamentoPIX e PagamentoBoleto, cada uma com sua própria implementação. A classe SistemaPagamento passou então a receber objetos dessa interface, delegando a responsabilidade da execução do pagamento. Com isso, o código se tornou mais modular, extensível e fácil de manter, permitindo a adição de novos métodos de pagamento sem a necessidade de alterar o código existente.

## L
### Relatório da letra "L"
O código original violava o Princípio de Liskov ao sobrescrever o método sacar() na classe ContaPoupanca lançando uma exceção, o que quebra o comportamento esperado da superclasse ContaBancaria. Isso significa que ContaPoupanca não poderia ser usada de forma segura como substituta de ContaBancaria. Para corrigir, a herança foi removida e o código foi refatorado usando uma interface comum Conta, com apenas os métodos compartilhados (depositar e getSaldo). A classe ContaCorrente adiciona o comportamento de saque, enquanto ContaPoupanca mantém apenas os métodos relevantes. Com essa mudança, cada tipo de conta expõe apenas o que realmente oferece, garantindo substituição segura e aderência ao princípio L do SOLID.

## I
### Relatório da letra "I"
O código original violava o Princípio da Segregação de Interfaces ao forçar a classe Carro a implementar métodos como voar() e navegar(), que não se aplicam a ela. Isso tornava o código menos coeso e mais propenso a erros. Para corrigir, a interface Veiculo foi dividida em três interfaces menores: VeiculoTerrestre, VeiculoAereo e VeiculoAquatico. Cada classe agora implementa apenas a interface que corresponde à sua função: Carro implementa VeiculoTerrestre, Aviao implementa VeiculoAereo e Barco implementa VeiculoAquatico. Com isso, o código ficou mais limpo, modular e aderente ao SOLID, permitindo maior reutilização e manutenção futura com menor impacto nas classes existentes.
