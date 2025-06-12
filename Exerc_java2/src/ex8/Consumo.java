package ex8;

public class Consumo {

    private double distancia;
    private double combustivel;

    public Consumo(double distancia, double combustivel) {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }

    public double consumoMedio() {
        return distancia / combustivel;
    }
}
