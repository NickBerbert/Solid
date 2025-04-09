package OSolid.Exemplo2;

public class PagamentoBoleto implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Boleto.");
    }
}
