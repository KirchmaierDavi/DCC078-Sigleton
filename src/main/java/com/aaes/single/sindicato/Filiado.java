package com.aaes.single.sindicato;

public class Filiado {
    private final String nome;
    private final String categoria;
    private final SindicatoCentral sindicatoCentral;

    public Filiado(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        sindicatoCentral = SindicatoCentral.getInstancia();
        sindicatoCentral.registrarFiliado();
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public SindicatoCentral getSindicatoCentral() {
        return sindicatoCentral;
    }
}
