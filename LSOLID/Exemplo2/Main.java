package LSOLID.Exemplo2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(1000);
        corrente.sacar(200);
        System.out.println("Saldo Conta Corrente: R$" + corrente.getSaldo());

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(500);
        System.out.println("Saldo Conta Poupança: R$" + poupanca.getSaldo());
    }
}
