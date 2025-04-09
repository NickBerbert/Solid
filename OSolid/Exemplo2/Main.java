package OSolid.Exemplo2;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        MetodoPagamento cartao = new PagamentoCartao();
        MetodoPagamento pix = new PagamentoPix();
        MetodoPagamento boleto = new PagamentoBoleto();

        sistema.realizarPagamento(100.0, cartao);
        sistema.realizarPagamento(250.0, pix);
        sistema.realizarPagamento(180.0, boleto);
    }
}
