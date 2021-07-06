package br.com.maratonajava.java.core.interfaces013.classes;

public class Produto implements Tributavel, Transportavel {

    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;


    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;

    }

    public Produto() {
    }

    @Override
    public void calculaImposto() {
       precoFinal = this.preco + (this.preco * IMPOSTO);

    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }

    @Override
    public String toString() {
        return "produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
