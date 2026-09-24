package com.aaes.single.sindicato;

public final class SindicatoCentral {
    private static SindicatoCentral instancia;
    private String nomeSindicato;
    private int totalFiliados;

    private SindicatoCentral() {
        nomeSindicato = "Sindicato Unificado dos Trabalhadores";
    }

    public static synchronized SindicatoCentral getInstancia() {
        if (instancia == null) {
            instancia = new SindicatoCentral();
        }
        return instancia;
    }

    public String getNomeSindicato() {
        return nomeSindicato;
    }

    public void setNomeSindicato(String nomeSindicato) {
        this.nomeSindicato = nomeSindicato;
    }

    public int getTotalFiliados() {
        return totalFiliados;
    }

    public void registrarFiliado() {
        totalFiliados++;
    }
}
