package ex2;

import org.w3c.dom.DOMImplementation;

public class Retangulo {

    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double area(){
        return base * altura;
    }

    public Double perimetro(){
        return 2 * (base + altura);
    }

    public Double diagonal(){
        return Math.sqrt(base * base + altura * altura);
    }
}
