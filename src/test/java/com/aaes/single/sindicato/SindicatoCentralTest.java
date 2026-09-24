package com.aaes.single.sindicato;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class SindicatoCentralTest {

    private SindicatoCentral sindicato;

    @BeforeEach
    void prepararCenario() {
        sindicato = SindicatoCentral.getInstancia();
        sindicato.setNomeSindicato("Sindicato Unificado dos Trabalhadores");
    }

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(sindicato, SindicatoCentral.getInstancia());
    }

    @Test
    void devePermitirAlterarNomeDoSindicato() {
        sindicato.setNomeSindicato("Sindicato dos Trabalhadores da Educacao");

        assertEquals("Sindicato dos Trabalhadores da Educacao",
                sindicato.getNomeSindicato());
    }

}
