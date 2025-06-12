package ex4;

import java.util.List;

public class Soma {

    private int numero;

    public Soma(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int somar(List<Soma> numeros) {
        int s = 0;
        for (Soma numero : numeros) {
            s += numero.numero;
        }
        return s;
    }
}
