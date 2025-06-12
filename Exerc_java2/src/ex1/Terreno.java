package ex1;

public class Terreno {

    private Double largura;
    private Double comprimento;
    private Double valor;

    public Terreno(Double largura, Double comprimento, Double valor) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valor = valor;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double tamanhoTerreno(){
        return largura * comprimento;
    }

    public Double valorTerreno(){
        Double area = tamanhoTerreno();
        return area * valor;
    }
}
