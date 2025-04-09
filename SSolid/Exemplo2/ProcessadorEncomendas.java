package SSolid.Exemplo2;

import java.util.Scanner;

public class ProcessadorEncomendas {

    private GravadorEncomendasEmArquivo gravador = new GravadorEncomendasEmArquivo();

    public void processar() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            String idEncomenda = sc.nextLine();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            double valorFrete = peso * 10;
            System.out.println("Valor do frete calculado: " + valorFrete);

            gravador.salvar(idEncomenda, valorFrete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

