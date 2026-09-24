package com.aaes.single.sindicato;

public class SindicatoDemo {
    public static void main(String[] args) {
        SindicatoCentral sindicato = SindicatoCentral.getInstancia();
        Filiado filiado = new Filiado("Joao", "Metalurgico");

        System.out.println("Sindicato: " + sindicato.getNomeSindicato());
        System.out.println("Filiado: " + filiado.getNome());
        System.out.println("Total de filiados: " + sindicato.getTotalFiliados());
    }
}
