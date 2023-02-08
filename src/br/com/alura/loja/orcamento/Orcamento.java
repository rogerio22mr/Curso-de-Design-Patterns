package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private Integer teste;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
