package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
     protected Desconto proximo;

    public Desconto(Desconto desconto) {
        this.proximo = desconto;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
