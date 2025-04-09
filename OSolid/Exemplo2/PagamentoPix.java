package OSolid.Exemplo2;

public class PagamentoPix implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}
