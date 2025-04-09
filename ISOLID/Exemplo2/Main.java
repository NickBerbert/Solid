package ISOLID.Exemplo2;

public class Main {
    public static void main(String[] args) {
        VeiculoTerrestre carro = new Carro();
        carro.dirigir();

        VeiculoAereo aviao = new Aviao();
        aviao.voar();

        VeiculoAquatico barco = new Barco();
        barco.navegar();
    }
}