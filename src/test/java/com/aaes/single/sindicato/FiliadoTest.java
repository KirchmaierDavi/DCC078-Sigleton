package com.aaes.single.sindicato;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class FiliadoTest {

    @BeforeEach
    void prepararCenario() {
        SindicatoCentral.getInstancia().setNomeSindicato("Sindicato Unificado dos Trabalhadores");
    }

    @Test
    void deveRegistrarFiliadoAoCriarNovoFiliado() {
        SindicatoCentral sindicato = SindicatoCentral.getInstancia();
        int totalAntes = sindicato.getTotalFiliados();

        new Filiado("Carlos", "Motorista");

        assertEquals(totalAntes + 1, sindicato.getTotalFiliados());
    }

    @Test
    void todosOsFiliadosDevemUsarOMesmoSindicato() {
        Filiado primeiro = new Filiado("Ana", "Enfermeira");
        Filiado segundo = new Filiado("Bruno", "Pedreiro");

        assertSame(primeiro.getSindicatoCentral(), segundo.getSindicatoCentral());
    }

    @Test
    void deveArmazenarNomeECategoriaDoFiliado() {
        Filiado filiado = new Filiado("Lucia", "Comerciaria");

        assertEquals("Lucia", filiado.getNome());
        assertEquals("Comerciaria", filiado.getCategoria());
    }
}
