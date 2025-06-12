package ex5;

import com.sun.source.tree.BreakTree;

public class Produto {

    private String nome;
    private Double preco;
    private Integer qtd;
    private Double dinheiroRecebido;

    public Produto(String nome, Double preco, Integer qtd, Double dinheiroRecebido) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getDinheiroRecebido() {
        return dinheiroRecebido;
    }

    public void setDinheiroRecebido(Double dinheiroRecebido) {
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public Double troco(){
        Double total = qtd * preco;
        Double troco = dinheiroRecebido - total;

        return troco;
    }




}
